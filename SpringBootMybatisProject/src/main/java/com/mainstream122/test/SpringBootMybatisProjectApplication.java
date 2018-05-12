package com.mainstream122.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mainstream122.test")
public class SpringBootMybatisProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisProjectApplication.class, args);
	}
}
