package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbUbAccessLogInfoMapperExtend;
import com.water.uubook.model.TbUbAccessLogInfo;
import com.water.uubook.model.TbUbAccessLogInfoCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbUbAccessLogInfoMapper extends TbUbAccessLogInfoMapperExtend {
    int countByExample(TbUbAccessLogInfoCriteria example);

    int deleteByExample(TbUbAccessLogInfoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUbAccessLogInfo record);

    int insertSelective(TbUbAccessLogInfo record);

    List<TbUbAccessLogInfo> selectByExampleWithRowbounds(TbUbAccessLogInfoCriteria example, RowBounds rowBounds);

    List<TbUbAccessLogInfo> selectByExample(TbUbAccessLogInfoCriteria example);

    TbUbAccessLogInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUbAccessLogInfo record, @Param("example") TbUbAccessLogInfoCriteria example);

    int updateByExample(@Param("record") TbUbAccessLogInfo record, @Param("example") TbUbAccessLogInfoCriteria example);

    int updateByPrimaryKeySelective(TbUbAccessLogInfo record);

    int updateByPrimaryKey(TbUbAccessLogInfo record);

    int insertBatch(List<TbUbAccessLogInfo> list);
}