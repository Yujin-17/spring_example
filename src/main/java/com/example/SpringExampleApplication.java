package com.example;
// base package
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) // DB 잠깐 안쓸때(오류해결법)
public class SpringExampleApplication {
// 이곳부터 시작.
	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}

}
