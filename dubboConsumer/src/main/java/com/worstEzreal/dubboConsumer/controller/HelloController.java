package com.worstEzreal.dubboConsumer.controller;

import com.worstEzreal.dubbo.service.IHelloService;
import com.worstEzreal.dubboConsumer.common.Result;
import com.worstEzreal.dubboConsumer.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2017/9/13
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private IHelloService helloService;
    @Autowired
    private CityService cityService;

    @RequestMapping("city/{id}")
    public Result hello(@PathVariable int id){
        String cityName = cityService.getCityById(id).getName();
        String helloCity = helloService.hello(cityName);
        logger.info("【dubbo接口调用成功】,msg={}",helloCity);
        return new Result("success","",helloCity);
    }

}
