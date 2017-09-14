package com.worstEzreal.dubboConsumer.dao;

import com.worstEzreal.dubboConsumer.entity.City;
import org.apache.ibatis.annotations.Param;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2017/9/14
 */
public interface CityDao {
    City getCityById(@Param("id") int id);
}
