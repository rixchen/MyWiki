package com.example.viki.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@SpringBootApplication
public class VikiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VikiApplication.class, args);
	}
}
