package com.tkachev.testspringdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class TestSpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringDataJpaApplication.class, args);
	}

}
