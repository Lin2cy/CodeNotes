package com.itmuch.cloud.microservicesimpleprovieruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceSimpleProvierUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleProvierUserApplication.class, args);
	}
}
