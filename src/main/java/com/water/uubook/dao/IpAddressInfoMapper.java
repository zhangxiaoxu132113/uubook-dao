package com.water.uubook.dao;

import com.water.uubook.dao.extend.IpAddressInfoMapperExtend;
import com.water.uubook.model.IpAddressInfo;
import com.water.uubook.model.IpAddressInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IpAddressInfoMapper extends IpAddressInfoMapperExtend {
    int countByExample(IpAddressInfoCriteria example);

    int deleteByExample(IpAddressInfoCriteria example);

    int insert(IpAddressInfo record);

    int insertSelective(IpAddressInfo record);

    List<IpAddressInfo> selectByExampleWithRowbounds(IpAddressInfoCriteria example, RowBounds rowBounds);

    List<IpAddressInfo> selectByExample(IpAddressInfoCriteria example);

    int updateByExampleSelective(@Param("record") IpAddressInfo record, @Param("example") IpAddressInfoCriteria example);

    int updateByExample(@Param("record") IpAddressInfo record, @Param("example") IpAddressInfoCriteria example);

    int insertBatch(List<IpAddressInfo> list);
}