package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbUbIpAddressInfoMapperExtend;
import com.water.uubook.model.TbUbIpAddressInfo;
import com.water.uubook.model.TbUbIpAddressInfoCriteria;
import com.water.uubook.model.TbUbIpAddressInfoKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbUbIpAddressInfoMapper extends TbUbIpAddressInfoMapperExtend {
    int countByExample(TbUbIpAddressInfoCriteria example);

    int deleteByExample(TbUbIpAddressInfoCriteria example);

    int deleteByPrimaryKey(TbUbIpAddressInfoKey key);

    int insert(TbUbIpAddressInfo record);

    int insertSelective(TbUbIpAddressInfo record);

    List<TbUbIpAddressInfo> selectByExampleWithRowbounds(TbUbIpAddressInfoCriteria example, RowBounds rowBounds);

    List<TbUbIpAddressInfo> selectByExample(TbUbIpAddressInfoCriteria example);

    TbUbIpAddressInfo selectByPrimaryKey(TbUbIpAddressInfoKey key);

    int updateByExampleSelective(@Param("record") TbUbIpAddressInfo record, @Param("example") TbUbIpAddressInfoCriteria example);

    int updateByExample(@Param("record") TbUbIpAddressInfo record, @Param("example") TbUbIpAddressInfoCriteria example);

    int updateByPrimaryKeySelective(TbUbIpAddressInfo record);

    int updateByPrimaryKey(TbUbIpAddressInfo record);

    int insertBatch(List<TbUbIpAddressInfo> list);
}