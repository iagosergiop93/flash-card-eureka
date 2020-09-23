package com.flashcard.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FlashCardEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashCardEurekaApplication.class, args);
	}

}
