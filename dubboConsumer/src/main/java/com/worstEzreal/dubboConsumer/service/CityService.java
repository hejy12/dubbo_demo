package com.worstEzreal.dubboConsumer.service;

import com.worstEzreal.dubboConsumer.dao.CityDao;
import com.worstEzreal.dubboConsumer.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2017/9/14
 */
@Service
public class CityService {
    @Autowired
    private CityDao cityDao;

    public City getCityById(int id){
        return cityDao.getCityById(id);
    }
}
