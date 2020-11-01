package com.godnan.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class SpringCloudEurekaApplication {

	public static void main(String[] args) {
		// @EnableEurekaServer 表示开启EurekaServer服务
		SpringApplication.run(SpringCloudEurekaApplication.class, args);
	}

}
