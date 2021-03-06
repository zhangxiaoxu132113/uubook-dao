package com.water.uubook.model.dto;

import com.water.uubook.model.Category;

import java.util.List;

/**
 * 文章分类
 * Created by mrwater on 2017/8/11.
 */
public class CategoryDto extends Category {
    private Integer total;
    private CategoryDto parent;
    private List<CategoryDto> children;

    private String parentName;
    private String createOnStr;

    private List<ArticleDto> hotArticles;

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

    public CategoryDto getParent() {
        return parent;
    }

    public void setParent(CategoryDto parent) {
        this.parent = parent;
    }

    public List<CategoryDto> getChildren() {
        return children;
    }

    public void setChildren(List<CategoryDto> children) {
        this.children = children;
    }

    public List<ArticleDto> getHotArticles() {
        return hotArticles;
    }

    public void setHotArticles(List<ArticleDto> hotArticles) {
        this.hotArticles = hotArticles;
    }
}
