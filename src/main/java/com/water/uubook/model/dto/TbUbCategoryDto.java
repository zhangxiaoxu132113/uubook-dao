package com.water.uubook.model.dto;

import com.water.uubook.model.TbUbCategory;

import java.util.List;

/**
 * 文章分类
 * Created by mrwater on 2017/8/11.
 */
public class TbUbCategoryDto extends TbUbCategory {
    private Integer total;
    private TbUbCategoryDto parent;
    private List<TbUbCategoryDto> children;

    private String parentName;
    private String createOnStr;

    private List<TbUbArticleDto> hotArticles;

    public String getCreateOnStr() {
        return createOnStr;
    }

    public void setCreateOnStr(String createOnStr) {
        this.createOnStr = createOnStr;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public TbUbCategoryDto getParent() {
        return parent;
    }

    public void setParent(TbUbCategoryDto parent) {
        this.parent = parent;
    }

    public List<TbUbCategoryDto> getChildren() {
        return children;
    }

    public void setChildren(List<TbUbCategoryDto> children) {
        this.children = children;
    }

    public List<TbUbArticleDto> getHotArticles() {
        return hotArticles;
    }

    public void setHotArticles(List<TbUbArticleDto> hotArticles) {
        this.hotArticles = hotArticles;
    }
}
