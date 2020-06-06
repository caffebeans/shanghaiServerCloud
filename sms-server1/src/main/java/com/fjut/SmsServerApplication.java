package com.fjut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SmsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsServerApplication.class, args);
	}

}
