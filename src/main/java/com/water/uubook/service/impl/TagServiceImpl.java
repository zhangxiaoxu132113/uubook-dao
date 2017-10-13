package com.water.uubook.service.impl;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.water.uubook.dao.TagMapper;
import com.water.uubook.model.Tag;
import com.water.uubook.model.TagCriteria;
import com.water.uubook.model.dto.CategoryDto;
import com.water.uubook.model.dto.TagDto;
import com.water.uubook.service.TagService;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import com.water.uubook.utils.Constants;
import com.water.uubook.utils.DateUtil;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service("tagService")
public class TagServiceImpl implements TagService {
    @Resource
    private TagMapper tagMapper;

    private LoadingCache<String, Object> cacheLocal;

    @Override
    public List<Tag> findArticleTags(String tags) {
        if (!StringUtils.isEmpty(tags)) {
            try {
                String[] tagIdStr = tags.split(",");
                List<Tag> tagList = new ArrayList<>();
                Map<Integer, Tag> tagMap = (Map<Integer, Tag>) cacheLocal.get(Constants.CacheKey.ALL_TAGS);
                Arrays.asList(tagIdStr).stream().forEach(p -> {
                   tagList.add(tagMap.get(Integer.parseInt(p)));
                });

                return tagList;
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<TagDto> getTagsByCondition(TagDto model, String[] cols, int currentPage, int pageSize) {
        Map<String, Object> queryParam = new HashMap<>();
        int begin = (currentPage - 1) * pageSize;
        queryParam.put("model", model);
        queryParam.put("cols", cols);
        queryParam.put("begin", begin);
        queryParam.put("pageSize", pageSize);
        List<TagDto> tagDtoList = tagMapper.getTagsByCondition(queryParam);
        tagDtoList.stream().forEach(p -> {
            p.setCreateOnStr(DateUtil.DATE_FORMAT_YMDHMS.format(p.getCreateTime()));
            if (org.apache.commons.lang3.StringUtils.isBlank(p.getParentName())) {
                p.setParentName("");
            }
        });

        return tagDtoList;
    }

    @Override
    public int countTagTotal(TagDto model) {
        if (model == null) {
            throw new RuntimeException("参数不合法！");
        }
        TagCriteria tagCriteria = new TagCriteria();
        TagCriteria.Criteria criteria = tagCriteria.createCriteria();
        if (model.getCategoryId() != null) {
            criteria.andCategoryIdEqualTo(model.getCategoryId());
        }

        return tagMapper.countByExample(tagCriteria);
    }

    @Override
    public int delTagById(Integer id) {
        if (id == null) {
            throw new RuntimeException("参数不合法！");
        }

        return tagMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateTag(Tag model) {
        if (model == null || model.getId() == null) {
            throw new RuntimeException("参数不合法！");
        }

        return tagMapper.updateByPrimaryKeySelective(model);
    }

    private Map<Integer, Tag> initializeTagMap() {
        List<Tag> tagList = tagMapper.selectByExample(null);
        Map<Integer, Tag> tagMap = new HashMap<>();
        for (Tag tag : tagList) {
            tagMap.put(tag.getId(), tag);
        }

        return tagMap;
    }

    @PostConstruct
    public void init() {
        cacheLocal = CacheBuilder.newBuilder().refreshAfterWrite(1, TimeUnit.DAYS).build(
                new CacheLoader<String, Object>() {
                    @Override
                    public Object load(String key) {
                        switch (key) {
                            case Constants.CacheKey.ALL_TAGS:
                                return initializeTagMap();
                        }
                        return null;
                    }
                }
        );
    }

}