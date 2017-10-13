package com.water.uubook.service.impl;

import com.water.uubook.dao.ArticleMapper;
import com.water.uubook.dao.TagMapper;
import com.water.uubook.model.Article;
import com.water.uubook.model.ArticleCriteria;
import com.water.uubook.model.Category;
import com.water.uubook.model.Tag;
import com.water.uubook.model.dto.ArticleDto;
import com.water.uubook.model.dto.CategoryDto;
import com.water.uubook.model.dto.TagDto;
import com.water.uubook.service.ArticleService;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.annotation.Resource;

import com.water.uubook.service.CategoryService;
import com.water.uubook.utils.DateUtil;
import org.apache.ibatis.ognl.ObjectArrayPool;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Resource
    private CategoryService categoryService;

    @Resource
    private TagMapper tagMapper;

    public List<ArticleDto> findArticleListByCondition(ArticleDto model, String[] queryField, Map<String, String> sortMap, int currentPage, int pageSize) {
        if (currentPage < 1 || pageSize < 0) {
            throw new RuntimeException("参数不合法！");
        }

        Map<String, Object> queryParam = new HashMap<String, Object>();
        queryParam.put("model", model);
        queryParam.put("cols", queryField);
        queryParam.put("begin", (currentPage - 1) * pageSize);
        queryParam.put("pageSize", pageSize);
        queryParam.put("sortMap", sortMap);
        List<ArticleDto> articleDtos = articleMapper.findArticleListByCondition(queryParam);
        this.handleArticleDetail(articleDtos);
        return articleDtos;
    }

    @Override
    public List<ArticleDto> findArticleListWithTagByCondition(ArticleDto model, String[] queryFeild, int currentPage, int pageSize) {
        if (currentPage < 1 || pageSize < 0) {
            throw new RuntimeException("参数不合法！");
        }
        Map<String, Object> queryParam = new HashMap<>();
        queryParam.put("model", model);
        queryParam.put("cols", queryFeild);
        queryParam.put("begin", (currentPage - 1) * pageSize);
        queryParam.put("pageSize", pageSize);
        List<ArticleDto> articleDtos = articleMapper.findArticleListWithTagByCondition(queryParam);
        this.handleArticleDetail(articleDtos);
        return articleDtos;
    }

    public List<ArticleDto> getArticleTag(List<ArticleDto> articleDtoList) {
        List<ArticleDto> result = new ArrayList<>();
        articleDtoList.stream().forEach(p -> {
            String tags = p.getTags();
            List<TagDto> allTags = tagMapper.getAllTags();
            if (!StringUtils.isEmpty(tags)) {
                List<Tag> tagList = new ArrayList<>();
                String tagIds[] = p.getTags().split(",");
                Arrays.asList(tagIds).forEach(b -> {
                    TagDto tmpTag = allTags.stream().filter(t -> t.getId() == Integer.parseInt(b)).findFirst().orElse(null);
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
    public ArticleDto findArticleById(Integer id) {
        if (id == null) {
            throw new RuntimeException("id不能唯空！");
        }
        Article model = articleMapper.selectByPrimaryKey(id);
        ArticleDto articleDto = new ArticleDto();
        BeanUtils.copyProperties(model, articleDto);
        return articleDto;
    }

    @Override
    public Integer countArticleTotal(ArticleDto model) {
        Map<String, Object> queryParam = new HashMap<>();
        queryParam.put("model", model);
        return articleMapper.getTotalCount(queryParam);
    }

    @Override
    public Integer updateArticle(Article article) {
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
    public List<ArticleDto> findArticleListInIds(String[] cols, Integer[] ids) {
        if (ids == null || ids.length <= 0) {
            throw new RuntimeException("参数不合法！");
        }
        Map<String, Object> queryParam = new HashMap<>();
        queryParam.put("cols", cols);
        queryParam.put("ids", ids);
        List<ArticleDto> articleDtoList = articleMapper.findArticleListInIds(queryParam);

        return articleDtoList;
    }

    /**
     * 将文章列表的数据进行细节的处理
     * @param articleDtos
     */
    private void handleArticleDetail(List<ArticleDto> articleDtos) {
        List<CategoryDto> allCategories = categoryService.getAllCategories();
        if (articleDtos != null && articleDtos.size() > 0) { // 设置分类的名称
            articleDtos.stream().forEach(p -> {
                if (p.getCategory() != null) {
                    CategoryDto categoryDto = allCategories.stream().filter(b -> b.getId() == p.getCategory())
                            .findFirst().orElse(null);
                    p.setCategoryStr(categoryDto == null ? "" : categoryDto.getName());
                }
                if (p.getCreateOn() != null) {
                    p.setCreateOnStr(DateUtil.DATE_FORMAT_YMDHM.format(new Date(p.getCreateOn())));
                }
            });
        }
    }
}