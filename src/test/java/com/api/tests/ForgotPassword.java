package com.api.tests;


import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPassword {

	@Test(description = "Verify if Forgot password API is working")
	public void createAccountTest() {

		AuthService authService = new AuthService();
		Response res = authService.forgotPassword("disha123er@gmail.com");

		System.out.println(res.asPrettyString());

	}
}
