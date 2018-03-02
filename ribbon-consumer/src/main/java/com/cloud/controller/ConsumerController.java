package com.cloud.controller;

import com.cloud.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mayn on 2018/2/10.
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("hello")
    public String hello(){
        return restTemplate.getForEntity("http://product-server/hello",String.class).getBody();
    }

    @RequestMapping("get")
    public String get(){
        return restTemplate.getForEntity("http://product-server/get?name={1}",String.class,"andrew.hu").getBody();
    }

    @RequestMapping("post")
    public String post(){
        User user = new User("finger",18);
        return restTemplate.postForEntity("http://product-server/post",user,String.class).getBody();
    }

    @RequestMapping("put")
    @ResponseBody
    public Object put(){
        User user = new User("finger",19);
        return restTemplate.postForEntity("http://product-server/put?type={1}",user,User.class,1);
    }

    @RequestMapping("delete")
    public String delete(){
        return restTemplate.getForEntity("http://product-server/delete/11",String.class).getBody();
    }

}
