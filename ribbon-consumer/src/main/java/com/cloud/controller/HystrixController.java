package com.cloud.controller;

import com.cloud.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mayn on 2018/2/12.
 */
@RestController
public class HystrixController {

    @Autowired
    public HystrixService hystrixService;

    @RequestMapping("fallbackTest")
    public String fallbackTest(){
        return hystrixService.fallbackTest();
    }
}
