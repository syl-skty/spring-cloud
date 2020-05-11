package com.skty.springcloud.consumer0.controller;

import com.skty.springcloud.consumer0.remotes.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/test")
    public String test(){
        return helloRemote.sayHello();
    }
}
