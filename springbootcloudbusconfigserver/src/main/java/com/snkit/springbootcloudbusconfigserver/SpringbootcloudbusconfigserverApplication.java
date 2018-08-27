package com.snkit.springbootcloudbusconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringbootcloudbusconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcloudbusconfigserverApplication.class, args);
	}
}
