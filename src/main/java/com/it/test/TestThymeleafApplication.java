package com.it.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages = { "com.it.test" })
@SpringBootApplication
public class TestThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestThymeleafApplication.class, args);
	}
}
