package com.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by mayn on 2018/2/13.
 */
@FeignClient("product-server/ext")
public interface ExtHelloService extends com.cloud.parent.service.HelloService{

}
