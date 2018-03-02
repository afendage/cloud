package com.cloud.controller;

import com.cloud.service.HelloService;
import com.cloud.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mayn on 2018/2/13.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("feign-hello")
    public String hello(){
        return helloService.hello();
    }

    @RequestMapping("feign-hello1")
    public String hello1(){
        return helloService.hello1("a fen");
    }

    @RequestMapping("feign-hello2")
    public String hello2(){
        return helloService.hello2("finger",18);
    }

    @RequestMapping("feign-hello3")
    public String hello3(){
        return helloService.hello3(new User("andrew.hu",28));
    }

}
