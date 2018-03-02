package com.cloud.parent.service;

import com.cloud.vo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by mayn on 2018/2/13.
 */
public interface HelloService {

    @RequestMapping("hello4")
    String hello4(@RequestParam("name") String name);

    @RequestMapping("hello5")
    String hello5(@RequestParam("name") String name,@RequestParam("age") Integer age);

    @RequestMapping("hello6")
    String hello6(@RequestBody User user);
}
