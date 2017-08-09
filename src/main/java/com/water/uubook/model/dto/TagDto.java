package com.water.uubook.model.dto;

import com.water.uubook.model.Tag;

import java.util.List;

/**
 * Created by mrwater on 2017/8/7.
 */
public class TagDto extends Tag {
    private List<TagDto> children;
    private String parentId;

    public TagDto() {
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<TagDto> getChildren() {
        return this.children;
    }

    public void setChildren(List<TagDto> children) {
        this.children = children;
    }
}