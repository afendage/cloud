package com.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mayn on 2018/2/12.
 */
@Service
public class HystrixService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String fallbackTest(){
        return restTemplate.getForEntity("http://product-server/fallbackTest",String.class).getBody();
    }

    public String error(Throwable e){
        return "executed fallback....error msg:"+e.getMessage();
    }
}
