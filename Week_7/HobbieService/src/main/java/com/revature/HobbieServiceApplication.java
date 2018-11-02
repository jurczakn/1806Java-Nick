package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class HobbieServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HobbieServiceApplication.class, args);
	}
	
	@GetMapping("/")
	public String getHobbie(){
		return "You have no hobbies, that's why you are on this app and have no friends";
	}
	
}
