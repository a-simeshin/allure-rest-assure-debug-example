package com.testing.allure.testingallure;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@Import(TestingAllureApplication.ControllerExample.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestingAllureApplicationTests {

	@LocalServerPort
	int port;

	@BeforeAll
	static void init() {
        RestAssured.filters(new AllureRestAssured());
    }

	@Test
	void checkThatFilterDoesNotThrowAnyExceptions() {
		assertDoesNotThrow(() -> RestAssured.get("http://localhost:" + port + "/hello"));
	}

}
