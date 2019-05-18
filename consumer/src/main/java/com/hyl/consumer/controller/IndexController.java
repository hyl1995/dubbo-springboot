package com.hyl.consumer.controller;

import com.hyl.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/testSayHello", method = RequestMethod.GET)
    String testSayHello(@RequestParam(value = "name", required = true) String name) {
        return  consumerService.sayHello(name);
    }

    @RequestMapping("/index")
    String home() {
        return "Hello Demo!";
    }
}
