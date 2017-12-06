package com.water.uubook.service.impl;

import com.water.uubook.dao.TbUbArticleMapper;
import com.water.uubook.dao.TbUbTagMapper;
import com.water.uubook.model.TbUbArticle;
import com.water.uubook.model.TbUbTag;
import com.water.uubook.model.dto.TbUbArticleDto;
import com.water.uubook.model.dto.TbUbCategoryDto;
import com.water.uubook.model.dto.TbUbTagDto;
import com.water.uubook.service.TbUbArticleService;
import com.water.uubook.service.TbUbCategoryService;
import com.water.uubook.service.TbUbTagService;
import com.water.uubook.utils.Constants;
import com.water.uubook.utils.DateUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.ExecutionException;

@Service("tbUbArticleService")
public class TbUbArticleServiceImpl implements TbUbArticleService {
    @Resource
    private TbUbArticleMapper articleMapper;

    @Resource
    private TbUbCategoryService tbUbCategoryService;

    @Resource
    private TbUbTagMapper tagMapper;

    @Resource
    private TbUbTagService tbUbTagService;

    public TbUbArticleDto getArticleDetailById(Integer articleId) {
        if (articleId == null || articleId < 0) {
            throw new RuntimeException("文章id不合法！");
        }
        TbUbArticle article = articleMapper.selectByPrimaryKey(articleId);
        TbUbArticleDto tbUbArticleDto = null;
        if (article != null) {
            tbUbArticleDto = new TbUbArticleDto();
            BeanUtils.copyProperties(article, tbUbArticleDto);
            tbUbArticleDto.setTagList(tbUbTagService.findArticleTags(tbUbArticleDto.getTags())); //设置文章的标签
        }
        return tbUbArticleDto;
    }

    public List<TbUbArticleDto> findArticleListByCondition(TbUbArticleDto model, String[] queryField, Map<String, String> sortMap, int currentPage, int pageSize) {
        if (currentPage < 1 || pageSize < 0) {
            throw new RuntimeException("参数不合法！");
        }

        Map<String, Object> queryParam = new HashMap<String, Object>();
        queryParam.put("model", model);
        queryParam.put("cols", queryField);
        queryParam.put("begin", (currentPage - 1) * pageSize);
        queryParam.put("pageSize", pageSize);
        queryParam.put("sortMap", sortMap);
        List<TbUbArticleDto> tbUbArticleDtos = articleMapper.findArticleListByCondition(queryParam);
        this.handleArticleDetail(tbUbArticleDtos);
        return tbUbArticleDtos;
    }

    @Override
    public List<TbUbArticleDto> findArticleListWithTagByCondition(TbUbArticleDto model, String[] queryFeild, int currentPage, int pageSize) {
        if (currentPage < 1 || pageSize < 0) {
            throw new RuntimeException("参数不合法！");
        }
        Map<String, Object> queryParam = new HashMap<>();
        queryParam.put("model", model);
        queryParam.put("cols", queryFeild);
        queryParam.put("begin", (currentPage - 1) * pageSize);
        queryParam.put("pageSize", pageSize);
        List<TbUbArticleDto> tbUbArticleDtos = articleMapper.findArticleListWithTagByCondition(queryParam);
        this.handleArticleDetail(tbUbArticleDtos);
        return tbUbArticleDtos;
    }

    public List<TbUbArticleDto> getArticleTag(List<TbUbArticleDto> tbUbArticleDtoList) {
        List<TbUbArticleDto> result = new ArrayList<>();
        tbUbArticleDtoList.stream().forEach(p -> {
            String tags = p.getTags();
            List<TbUbTagDto> allTags = tagMapper.getAllTags();
            if (!StringUtils.isEmpty(tags)) {
                List<TbUbTag> tagList = new ArrayList<>();
                String tagIds[] = p.getTags().split(",");
                Arrays.asList(tagIds).forEach(b -> {
                    TbUbTagDto tmpTag = allTags.stream().filter(t -> t.getId() == Integer.parseInt(b)).findFirst().orElse(null);
                    if (tmpTag != null) {
                        tagList.add(tmpTag);
                    }
                });
                p.setTagList(tagList);
            }

            result.add(p);
        });

        return result;
    }

    @Override
    public TbUbArticleDto findArticleById(Integer id) {
        TbUbArticle model = null;
        TbUbArticleDto tbUbArticleDto = null;
        try {
            if (id == null) {
                throw new RuntimeException("id不能唯空！");
            }
            model = articleMapper.selectByPrimaryKey(id);
            tbUbArticleDto = new TbUbArticleDto();
            BeanUtils.copyProperties(model, tbUbArticleDto);
            TbUbCategoryDto tbUbCategoryDto = tbUbCategoryService.getCategoryById(tbUbArticleDto.getCategory());
            tbUbArticleDto.setTbUbCategoryDto(tbUbCategoryDto);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return tbUbArticleDto;
    }

    @Override
    public Integer countArticleTotal(TbUbArticleDto model) {
        Map<String, Object> queryParam = new HashMap<>();
        queryParam.put("model", model);
        return articleMapper.getTotalCount(queryParam);
    }

    @Override
    public Integer updateArticle(TbUbArticle article) {
        if (article == null || article.getId() == null) {
            throw new RuntimeException("参数不合法!");
        }
        return articleMapper.updateByPrimaryKeySelective(article);
    }

    @Override
    public void delArticleById(Integer id) {
        if (id == null) {
            throw new RuntimeException("id不能为空！");
        }
        articleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<TbUbArticleDto> findArticleListInIds(String[] cols, Integer[] ids) {
        if (ids == null || ids.length <= 0) {
            throw new RuntimeException("参数不合法！");
        }
        Map<String, Object> queryParam = new HashMap<>();
        queryParam.put("cols", cols);
        queryParam.put("ids", ids);
        List<TbUbArticleDto> tbUbArticleDtoList = articleMapper.findArticleListInIds(queryParam);

        return tbUbArticleDtoList;
    }

    @Override
    public TbUbArticle selectByPrimaryKey(Integer articleId) {
        return articleMapper.selectByPrimaryKey(articleId);
    }

    @Override
    public void updateByPrimaryKeySelective(TbUbArticle article) {
        articleMapper.updateByPrimaryKeySelective(article);
    }

    /**
     * 将文章列表的数据进行细节的处理
     * @param tbUbArticleDtos
     */
    private void handleArticleDetail(List<TbUbArticleDto> tbUbArticleDtos) {
        List<TbUbCategoryDto> allCategories = tbUbCategoryService.getAllCategories();
        if (tbUbArticleDtos != null && tbUbArticleDtos.size() > 0) { // 设置分类的名称
            tbUbArticleDtos.stream().forEach(p -> {
                if (p.getCategory() != null) {
                    TbUbCategoryDto tbUbCategoryDto = allCategories.stream().filter(b -> b.getId() == p.getCategory())
                            .findFirst().orElse(null);
                    p.setCategoryStr(tbUbCategoryDto == null ? "" : tbUbCategoryDto.getName());
                }
                if (p.getCreateOn() != null) {
                    p.setCreateOnStr(DateUtil.DATE_FORMAT_YMDHM.format(new Date(p.getCreateOn())));
                }
                if (p.getModule() != null) {
                    p.setModuleStr(Constants.ARTICLE_MODULE_MAP.get(p.getModule()));
                }
            });
        }
    }
}