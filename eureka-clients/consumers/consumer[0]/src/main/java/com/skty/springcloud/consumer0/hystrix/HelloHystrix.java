package com.skty.springcloud.consumer0.hystrix;

import com.skty.springcloud.consumer0.remotes.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * 对helloRemote实现的熔断器某认返回值
 */
@Component
public class HelloHystrix implements HelloRemote {
    @Override
    public String sayHello() {
        return "hello ,mother fuck!!!";
    }
}
