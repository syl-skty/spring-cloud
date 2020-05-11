package com.skty.springcloud.consumer0.remotes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("eureka-producer")
public interface HelloRemote {

    @RequestMapping("/sayHello")
    String sayHello();
}
