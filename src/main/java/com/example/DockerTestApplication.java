package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.UnknownHostException;

@SpringBootApplication
public class DockerTestApplication {
	public static void main(String[] args) throws UnknownHostException {

		SpringApplication.run(DockerTestApplication.class, args);
	}

}
