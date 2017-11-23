package com.water.uubook.model.dto;

import com.water.uubook.model.TbUbArticle;
import com.water.uubook.model.TbUbTag;
import com.water.uubook.utils.annotations.DictDesc;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mrwater on 2017/4/5.
 */
public class TbUbArticleDto extends TbUbArticle implements Serializable {
    private List<TbUbArticle> relatedArticles;
    private List<TbUbTag> tagList;
    private Integer[] ids;

    private TbUbCategoryDto tbUbCategoryDto;

    private Integer parentCategory;
    @DictDesc(typeName = "storage_type", refField = "category")
    private String categoryStr;
    private String createOnStr;
    private String moduleStr;

    private Integer tagId;
    private String tagName;

    private int draw;
    private int currentPage;
    private int pageSize;

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getCreateOnStr() {
        return createOnStr;
    }

    public void setCreateOnStr(String createOnStr) {
        this.createOnStr = createOnStr;
    }

    public String getCategoryStr() {
        return categoryStr;
    }

    public void setCategoryStr(String categoryStr) {
        this.categoryStr = categoryStr;
    }

    public List<TbUbArticle> getRelatedArticles() {
        return relatedArticles;
    }

    public void setRelatedArticles(List<TbUbArticle> relatedArticles) {
        this.relatedArticles = relatedArticles;
    }

    public List<TbUbTag> getTagList() {
        return tagList;
    }

    public void setTagList(List<TbUbTag> tagList) {
        this.tagList = tagList;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Integer getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Integer parentCategory) {
        this.parentCategory = parentCategory;
    }

    public String getModuleStr() {
        return moduleStr;
    }

    public void setModuleStr(String moduleStr) {
        this.moduleStr = moduleStr;
    }

    public TbUbCategoryDto getTbUbCategoryDto() {

        return tbUbCategoryDto;
    }

    public void setTbUbCategoryDto(TbUbCategoryDto tbUbCategoryDto) {
        this.tbUbCategoryDto = tbUbCategoryDto;
    }
}
