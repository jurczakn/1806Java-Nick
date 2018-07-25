package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*Marks the application as a Spring Boot Application
 * This annotation encompasses several other annotations
 * including: @Configuration, @EnableAutoConfiguration, and
 * @ComponenetScan
 * If any these annotations require further configuration,
 * they can be added without issue.*/
@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}
}
