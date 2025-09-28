package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.healthrecord")
public class HealthRecordApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthRecordApplication.class, args);
	}

}
