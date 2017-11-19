package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbCeFetchArticleTaskMapperExtend;
import com.water.uubook.model.TbCeFetchArticleTask;
import com.water.uubook.model.TbCeFetchArticleTaskCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbCeFetchArticleTaskMapper extends TbCeFetchArticleTaskMapperExtend {
    int countByExample(TbCeFetchArticleTaskCriteria example);

    int deleteByExample(TbCeFetchArticleTaskCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TbCeFetchArticleTask record);

    int insertSelective(TbCeFetchArticleTask record);

    List<TbCeFetchArticleTask> selectByExampleWithRowbounds(TbCeFetchArticleTaskCriteria example, RowBounds rowBounds);

    List<TbCeFetchArticleTask> selectByExample(TbCeFetchArticleTaskCriteria example);

    TbCeFetchArticleTask selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbCeFetchArticleTask record, @Param("example") TbCeFetchArticleTaskCriteria example);

    int updateByExample(@Param("record") TbCeFetchArticleTask record, @Param("example") TbCeFetchArticleTaskCriteria example);

    int updateByPrimaryKeySelective(TbCeFetchArticleTask record);

    int updateByPrimaryKey(TbCeFetchArticleTask record);

    int insertBatch(List<TbCeFetchArticleTask> list);
}