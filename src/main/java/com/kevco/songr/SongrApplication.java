package com.kevco.songr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SongrApplication {
	public static void main(String[] args) {
		SpringApplication.run(SongrApplication.class, args);
	}

}
