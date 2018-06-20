package com.concretepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRestApplication {
	public static void main(String[] args) {
		System.out.println("poola");
		
		SpringApplication.run(SimpleRestApplication.class, args);
	}
}
