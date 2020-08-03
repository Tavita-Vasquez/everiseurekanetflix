package com.server.eureka.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
 

@EnableEurekaServer
@SpringBootApplication
public class Application {

	//spring boot eureka
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
