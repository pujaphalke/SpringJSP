package com.springboot.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginAppApplication {

	public static void main(String[] args) {
		System.out.println("SpringBoot-Started");
		SpringApplication.run(LoginAppApplication.class, args);
	}

}
