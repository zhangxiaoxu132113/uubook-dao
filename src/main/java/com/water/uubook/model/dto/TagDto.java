package com.water.uubook.model.dto;

import com.water.uubook.model.Tag;

import java.util.List;

/**
 * Created by mrwater on 2017/8/7.
 */
public class TagDto extends Tag {
    private Integer total;
    private String parentName;
    private String categoryName;
    private String createOnStr;
    private List<TagDto> children;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

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

    public List<TagDto> getChildren() {
        return this.children;
    }

    public void setChildren(List<TagDto> children) {
        this.children = children;
    }
}