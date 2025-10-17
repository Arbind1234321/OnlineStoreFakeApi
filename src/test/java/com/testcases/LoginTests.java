package com.testcases;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import org.testng.annotations.Test;

import com.payloads.Payload;
import com.pojo.Login;
import com.routes.Routes;

import io.restassured.http.ContentType;

public class LoginTests extends BaseClass {

	@Test
	public void testInvalidLogin() {

		Login newLogin = Payload.loginPayLoad();

		given().contentType(ContentType.JSON).body(newLogin).when().post(Routes.AUTH_LOGIN).then().statusCode(401).log()
				.body().body(equalTo("username or password is incorrect"));

	}

	@Test
	public void testValidLogin() {

		String username=configReader.getProperty("username");
		String password=configReader.getProperty("password");
		Login newLogin =new Login(username,password);

		given().contentType(ContentType.JSON)
		.body(newLogin).when().post(Routes.AUTH_LOGIN).then().statusCode(201).log()
				.body()
				.body("token",notNullValue());

	}
}
