package com.hyl.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.hyl.sdk.service.Person;
import com.hyl.sdk.service.UserServiceBo;
import org.springframework.stereotype.Component;

@Service(interfaceClass = UserServiceBo.class,group="dubbo",version="1.0.0")
@Component
public class UserServiceBoImpl implements UserServiceBo {

    @Override
    public String sayHello(String name) {
        return "hello:" + name;
    }

    @Override
    public String testPojo(Person person) {
        return person.toString();
    }

}