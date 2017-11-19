package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbCeFetchArticleTaskRecordMapperExtend;
import com.water.uubook.model.TbCeFetchArticleTaskRecord;
import com.water.uubook.model.TbCeFetchArticleTaskRecordCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbCeFetchArticleTaskRecordMapper extends TbCeFetchArticleTaskRecordMapperExtend {
    int countByExample(TbCeFetchArticleTaskRecordCriteria example);

    int deleteByExample(TbCeFetchArticleTaskRecordCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TbCeFetchArticleTaskRecord record);

    int insertSelective(TbCeFetchArticleTaskRecord record);

    List<TbCeFetchArticleTaskRecord> selectByExampleWithRowbounds(TbCeFetchArticleTaskRecordCriteria example, RowBounds rowBounds);

    List<TbCeFetchArticleTaskRecord> selectByExample(TbCeFetchArticleTaskRecordCriteria example);

    TbCeFetchArticleTaskRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbCeFetchArticleTaskRecord record, @Param("example") TbCeFetchArticleTaskRecordCriteria example);

    int updateByExample(@Param("record") TbCeFetchArticleTaskRecord record, @Param("example") TbCeFetchArticleTaskRecordCriteria example);

    int updateByPrimaryKeySelective(TbCeFetchArticleTaskRecord record);

    int updateByPrimaryKey(TbCeFetchArticleTaskRecord record);

    int insertBatch(List<TbCeFetchArticleTaskRecord> list);
}