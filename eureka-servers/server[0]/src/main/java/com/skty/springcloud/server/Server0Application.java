package com.skty.springcloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Server0Application {

	public static void main(String[] args) {
		SpringApplication.run(Server0Application.class, args);
	}

}
