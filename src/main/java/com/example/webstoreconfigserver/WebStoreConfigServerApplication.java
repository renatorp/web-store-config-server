package com.example.webstoreconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class WebStoreConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebStoreConfigServerApplication.class, args);
	}
}
