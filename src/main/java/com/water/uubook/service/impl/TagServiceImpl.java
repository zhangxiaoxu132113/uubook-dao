package com.water.uubook.service.impl;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.water.uubook.dao.TagMapper;
import com.water.uubook.model.Tag;
import com.water.uubook.model.TagCriteria;
import com.water.uubook.model.dto.CategoryDto;
import com.water.uubook.service.TagService;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import com.water.uubook.utils.Constants;
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