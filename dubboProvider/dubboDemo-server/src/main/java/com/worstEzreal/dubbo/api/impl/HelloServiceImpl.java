package com.worstEzreal.dubbo.api.impl;

import com.worstEzreal.dubbo.service.IHelloService;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2017/9/13
 */
public class HelloServiceImpl implements IHelloService {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
