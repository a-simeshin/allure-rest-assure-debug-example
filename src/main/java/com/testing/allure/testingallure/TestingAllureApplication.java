package com.testing.allure.testingallure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestingAllureApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingAllureApplication.class, args);
	}

	@RestController
	static class ControllerExample {

		@GetMapping("/hello")
		String hello() {
			return "Hello World!";
		}
	}

}
