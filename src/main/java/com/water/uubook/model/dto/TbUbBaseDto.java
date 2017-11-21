package com.water.uubook.model.dto;

import com.water.uubook.model.TbUbBase;

import java.util.List;

/**
 * Created by mrwater on 2017/11/21.
 */
public class TbUbBaseDto extends TbUbBase {
    private TbUbBaseDto parent;
    private List<TbUbBaseDto> children;

    public TbUbBaseDto getParent() {
        return parent;
    }

    public void setParent(TbUbBaseDto parent) {
        this.parent = parent;
    }

    public List<TbUbBaseDto> getChildren() {
        return children;
    }

    public void setChildren(List<TbUbBaseDto> children) {
        this.children = children;
    }
}
