package com.spring.cloud.server.registory.practical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AmozonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmozonServerApplication.class, args);
	}

}
