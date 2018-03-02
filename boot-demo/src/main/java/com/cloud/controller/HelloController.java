package com.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mayn on 2018/2/10.
 */
@RestController
public class HelloController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private CounterService counterService;
    @RequestMapping("hello")
    public String hello(){
        counterService.increment("hello.count"); //统计被访问的次数
        return applicationName+" say: hello world!";
    }
}
