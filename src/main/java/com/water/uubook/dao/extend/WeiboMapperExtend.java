package com.water.uubook.dao.extend;

import com.water.uubook.model.Weibo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WeiboMapperExtend {
    List<Weibo> getWeiboByUserId(@Param(value = "userId") String userId);
}