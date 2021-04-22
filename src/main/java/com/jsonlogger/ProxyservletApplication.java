package com.jsonlogger;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyservletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyservletApplication.class, args);
	}
	
	@PostConstruct
	public void testLogger () {
		Logger logger = LoggerFactory.getLogger("jsonLogger");
		logger.debug("Debug message");
	}
}
