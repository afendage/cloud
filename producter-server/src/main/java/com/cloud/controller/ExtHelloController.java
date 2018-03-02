package com.cloud.controller;

import com.cloud.parent.service.HelloService;
import com.cloud.vo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mayn on 2018/2/13.
 */
@RestController
@RequestMapping("ext")
public class ExtHelloController implements HelloService{

    @Override
    public String hello4(String name) {
        return "hello "+name;
    }

    @Override
    public String hello5(String name, Integer age) {
        return "name is "+name +" age is "+age;
    }

    @Override
    public String hello6(@RequestBody User user) {
        return "name is "+user.getName() +" age is "+user.getAge();
    }
}
