package com.water.uubook.service.impl;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.water.uubook.dao.TbUbTagMapper;
import com.water.uubook.model.TbUbTag;
import com.water.uubook.model.TbUbTagCriteria;
import com.water.uubook.model.dto.TbUbTagDto;
import com.water.uubook.service.TbUbTagService;
import com.water.uubook.utils.Constants;
import com.water.uubook.utils.DateUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@Service("tbUbTagService")
public class TbUbTagServiceImpl implements TbUbTagService {
    @Resource
    private TbUbTagMapper tagMapper;

    private LoadingCache<String, Object> cacheLocal;

    @Override
    public List<TbUbTag> findArticleTags(String tags) {
        if (!StringUtils.isEmpty(tags)) {
            try {
                String[] tagIdStr = tags.split(",");
                List<TbUbTag> tagList = new ArrayList<>();
                Map<Integer, TbUbTag> tagMap = (Map<Integer, TbUbTag>) cacheLocal.get(Constants.CacheKey.ALL_TAGS);
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
    public List<TbUbTagDto> getTagsByCondition(TbUbTagDto model, String[] cols, int currentPage, int pageSize) {
        Map<String, Object> queryParam = new HashMap<>();
        int begin = (currentPage - 1) * pageSize;
        queryParam.put("model", model);
        queryParam.put("cols", cols);
        queryParam.put("begin", begin);
        queryParam.put("pageSize", pageSize);
        List<TbUbTagDto> tbUbTagDtoList = tagMapper.getTagsByCondition(queryParam);
        tbUbTagDtoList.stream().forEach(p -> {
            p.setCreateOnStr(DateUtil.DATE_FORMAT_YMDHMS.format(p.getCreateTime()));
            if (org.apache.commons.lang3.StringUtils.isBlank(p.getParentName())) {
                p.setParentName("");
            }
        });

        return tbUbTagDtoList;
    }

    @Override
    public int countTagTotal(TbUbTagDto model) {
        if (model == null) {
            throw new RuntimeException("参数不合法！");
        }
        TbUbTagCriteria tagCriteria = new TbUbTagCriteria();
        TbUbTagCriteria.Criteria criteria = tagCriteria.createCriteria();
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
    public int updateTag(TbUbTag model) {
        if (model == null || model.getId() == null) {
            throw new RuntimeException("参数不合法！");
        }

        return tagMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public List<TbUbTag> getAllTbUbTag() {
        return tagMapper.selectByExample(null);
    }

    private Map<Integer, TbUbTag> initializeTagMap() {
        List<TbUbTag> tagList = tagMapper.selectByExample(null);
        Map<Integer, TbUbTag> tagMap = new HashMap<>();
        for (TbUbTag tag : tagList) {
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