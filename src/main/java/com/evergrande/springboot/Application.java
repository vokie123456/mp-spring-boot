package com.evergrande.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	protected final static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.run(args);
		logger.info("PortalApplication is sussess!");
		System.err.println("sample started 1. http://172.16.102.178:9999/");
		System.err.println("sample started 2. http://127.0.0.1:9999/");
	}

}
