package com.studentsmanagementsystem.studentsmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.studentsmanagementsystem.studentsmanagementsystem.entity")
public class StudentsmanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsmanagementsystemApplication.class, args);
	}

}
