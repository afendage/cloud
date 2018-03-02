package com.cloud.controller;

import com.cloud.vo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mayn on 2018/2/13.
 */
@RestController
@RequestMapping("feign")
public class FeignController {

    @RequestMapping("hello")
    public String hello(){
        return "hello world!";
    }

    @RequestMapping("hello1")
    public String hello1(@RequestParam("name") String name){
        return "- hello "+name;
    }
    @RequestMapping("hello2")
    public String hello2(@RequestParam("name") String name,@RequestParam("age") Integer age){
        return "= hello "+name +" age "+age;
    }
    @RequestMapping("hello3")
    public String hello3(@RequestBody User user){
        return "-= hello "+user.getName() +" age "+user.getAge();
    }
}
