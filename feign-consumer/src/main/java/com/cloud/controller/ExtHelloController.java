package com.cloud.controller;

import com.cloud.service.ExtHelloService;
import com.cloud.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mayn on 2018/2/13.
 */
@RestController
public class ExtHelloController {

    @Autowired
    private ExtHelloService extHelloService;

    @RequestMapping("getHelloDate")
    public String getHelloDate(){
        StringBuilder sb = new StringBuilder();
        sb.append(extHelloService.hello4("binge")).append("\r\n");
        sb.append(extHelloService.hello5("finger",18)).append("\n\n");
        sb.append(extHelloService.hello6(new User("linger",22))).append("\n\n");
        return sb.toString();
    }

}
