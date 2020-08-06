package com.udacity.lesson4microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Lesson4microserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lesson4microserviceApplication.class, args);
	}

}
