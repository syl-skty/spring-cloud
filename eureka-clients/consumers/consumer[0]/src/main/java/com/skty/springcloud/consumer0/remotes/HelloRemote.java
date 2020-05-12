package com.skty.springcloud.consumer0.remotes;

import com.skty.springcloud.consumer0.hystrix.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@FeignClient(value = "eureka-producer",fallback = HelloHystrix.class)
public interface HelloRemote {
    @RequestMapping("/sayHello")
    String sayHello();
}
