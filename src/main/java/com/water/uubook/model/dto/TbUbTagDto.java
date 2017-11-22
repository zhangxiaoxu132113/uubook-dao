package com.water.uubook.model.dto;

import com.water.uubook.model.TbUbTag;

import java.util.List;

/**
 * Created by mrwater on 2017/8/7.
 */
public class TbUbTagDto extends TbUbTag {
    private Integer total;
    private String parentName;
    private String categoryName;
    private String createOnStr;
    private TbUbTagDto parent;
    private List<TbUbTagDto> children;

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

    public List<TbUbTagDto> getChildren() {
        return this.children;
    }

    public void setChildren(List<TbUbTagDto> children) {
        this.children = children;
    }

    public TbUbTagDto getParent() {
        return parent;
    }

    public void setParent(TbUbTagDto parent) {
        this.parent = parent;
    }
}