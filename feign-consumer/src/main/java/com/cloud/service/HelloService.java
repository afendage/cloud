package com.cloud.service;

import com.cloud.vo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by mayn on 2018/2/13.
 */
@FeignClient("product-server/feign")
public interface HelloService {

    @RequestMapping("hello")
    String hello();

    @RequestMapping("hello1")
    String hello1(@RequestParam("name") String name);

    @RequestMapping("hello2")
    String hello2(@RequestParam("name") String name,@RequestParam("age") Integer age);

    @RequestMapping("hello3")
    String hello3(@RequestBody User user);
}
