package com.water.uubook.service.impl;

import com.water.uubook.dao.ArticleMapper;
import com.water.uubook.dao.TagMapper;
import com.water.uubook.model.Article;
import com.water.uubook.model.ArticleCriteria;
import com.water.uubook.model.Tag;
import com.water.uubook.model.dto.ArticleDto;
import com.water.uubook.model.dto.TagDto;
import com.water.uubook.service.ArticleService;

import java.util.*;
import javax.annotation.Resource;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Resource
    private TagMapper tagMapper;

    public List<ArticleDto> findArticleListByCondition(ArticleDto model, String[] queryField, int currentPage, int pageSize) {
        if (currentPage < 1|| pageSize < 0) {
            throw new RuntimeException("参数不合法！");
        }

        Map<String, Object> queryParam = new HashMap<String, Object>();
        queryParam.put("model", model);
        queryParam.put("cols", queryField);
        queryParam.put("begin", (currentPage - 1) * pageSize);
        queryParam.put("pageSize", pageSize);
        List<ArticleDto> articleDtos = articleMapper.findArticleListByCondition(queryParam);
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
}