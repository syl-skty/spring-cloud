package com.skty.springcloud.consumer0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients  //使用feign进行restful调用，里面自带负载均衡和熔断
@EnableHystrix //启用Hystrix监控
@SpringBootApplication
public class Consumer0Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer0Application.class, args);
    }

}
