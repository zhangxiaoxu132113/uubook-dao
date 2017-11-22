package com.water.uubook.dao;

import com.water.uubook.dao.extend.TbUbUserMapperExtend;
import com.water.uubook.model.TbUbUser;
import com.water.uubook.model.TbUbUserCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TbUbUserMapper extends TbUbUserMapperExtend {
    int countByExample(TbUbUserCriteria example);

    int deleteByExample(TbUbUserCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUbUser record);

    int insertSelective(TbUbUser record);

    List<TbUbUser> selectByExampleWithRowbounds(TbUbUserCriteria example, RowBounds rowBounds);

    List<TbUbUser> selectByExample(TbUbUserCriteria example);

    TbUbUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUbUser record, @Param("example") TbUbUserCriteria example);

    int updateByExample(@Param("record") TbUbUser record, @Param("example") TbUbUserCriteria example);

    int updateByPrimaryKeySelective(TbUbUser record);

    int updateByPrimaryKey(TbUbUser record);

    int insertBatch(List<TbUbUser> list);
}