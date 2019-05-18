package com.hyl.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hyl.sdk.service.UserServiceBo;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    @Reference(group="dubbo",interfaceClass= UserServiceBo.class,version="1.0.0")
    private UserServiceBo userServiceBo;

    public String sayHello(String name){
        return userServiceBo.sayHello(name);
    }
}
