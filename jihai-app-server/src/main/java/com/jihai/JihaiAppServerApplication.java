package com.jihai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JihaiAppServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JihaiAppServerApplication.class, args);
	}
}
