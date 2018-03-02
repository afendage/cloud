package com.cloud.controller;

import com.cloud.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mayn on 2018/2/10.
 */
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("getServerInfo")
    public String getServerInfo(){
        ServiceInstance instance = client.getLocalServiceInstance();
        return "host:"+instance.getHost()+" , service_id:" + instance.getServiceId();
    }

    @RequestMapping("hello")
    public String hello(){
        return "hello world!";
    }

    @RequestMapping("get")
    public String get(String name){
        return "hello "+name;
    }

    @RequestMapping(value="post",method = RequestMethod.POST)
    public String post(@RequestBody User user){
        return "hello "+user.getName() +" age "+user.getAge();
    }

    @RequestMapping("put")
    @ResponseBody
    public Object put(@RequestBody User user,@RequestParam("type") Integer type){
        if(type>0){
            user.setAge(18);
            user.setName("andrew.hu");
        }else{
            user.setAge(28);
            user.setName("finger");
        }
        return user;
    }

    @RequestMapping("delete/{id}")
    public String post(@PathVariable("id") String id){
        return "deleted id "+id;
    }

    @RequestMapping("fallbackTest")
    public String fallbackTest(){
        try {
            Thread.sleep(3000);
            return "no executed fallback!!";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "other error!!";
    }

}
