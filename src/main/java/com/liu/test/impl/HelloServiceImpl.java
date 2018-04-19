package com.liu.test.impl;

import com.liu.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author liujiawei
 * @create 2018-04-19 下午8:35
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello";
    }
}
