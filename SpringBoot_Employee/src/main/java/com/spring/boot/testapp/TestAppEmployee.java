package com.spring.boot.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.spring.boot.testapp")
@EntityScan("com.spring.boot.testapp.employee")
public class TestAppEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TestAppEmployee.class, args);

	}

}
