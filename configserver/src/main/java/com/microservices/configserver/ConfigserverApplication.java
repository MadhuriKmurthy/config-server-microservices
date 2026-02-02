package com.microservices.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * To access the configs use:
 * http://localhost:8071/accounts/default
 * http://localhost:8071/accounts/qa
 * http://localhost:8071/accounts/prod
 * http://localhost:8071/cards/default
 * http://localhost:8071/cards/qa
 * http://localhost:8071/cards/prod
 * http://localhost:8071/loans/default
 * http://localhost:8071/loans/qa
 * http://localhost:8071/loans/prod
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}

}
