package com.water.uubook.dao;

import com.water.uubook.dao.extend.AccessLogInfoMapperExtend;
import com.water.uubook.model.AccessLogInfo;
import com.water.uubook.model.AccessLogInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AccessLogInfoMapper extends AccessLogInfoMapperExtend {
    int countByExample(AccessLogInfoCriteria example);

    int deleteByExample(AccessLogInfoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccessLogInfo record);

    int insertSelective(AccessLogInfo record);

    List<AccessLogInfo> selectByExampleWithRowbounds(AccessLogInfoCriteria example, RowBounds rowBounds);

    List<AccessLogInfo> selectByExample(AccessLogInfoCriteria example);

    AccessLogInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccessLogInfo record, @Param("example") AccessLogInfoCriteria example);

    int updateByExample(@Param("record") AccessLogInfo record, @Param("example") AccessLogInfoCriteria example);

    int updateByPrimaryKeySelective(AccessLogInfo record);

    int updateByPrimaryKey(AccessLogInfo record);

    int insertBatch(List<AccessLogInfo> list);
}