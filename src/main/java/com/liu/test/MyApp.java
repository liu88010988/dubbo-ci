package com.liu.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author liujiawei
 * @create 2018-04-19 下午8:31
 */
@SpringBootApplication
@ImportResource("classpath:dubbo-pro.xml")
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}
