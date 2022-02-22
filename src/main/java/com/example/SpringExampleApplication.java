package com.example;
// base package
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// @EnableAutoConfiguration(exclude={DataSourseAutoConfiguraion.class})
@SpringBootApplication
public class SpringExampleApplication {
// 이곳부터 시작.
	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}
	
	

}
