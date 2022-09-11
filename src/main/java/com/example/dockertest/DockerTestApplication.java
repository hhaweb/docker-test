package com.example.dockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
	}

	@GetMapping("/home")
	public String  Index() {
		return "Hello, It is work";
	}
}
