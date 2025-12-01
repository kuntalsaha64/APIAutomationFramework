package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpReq;

import io.restassured.response.Response;

public class AccountCreation {
	
	@Test(description = "Verify if signup API is working")
	public void createAccountTest() {
		
		
		SignUpReq signupReq =  new SignUpReq.Builder().username("kusaha")
		 	.password("password123")
		 	.mobileNum("9876543210")
		 	.email("abc@gmail.com")
		 	.firstname("KS")
		 	.lastname("S")
		 	.build();
		
		AuthService authService = new AuthService();
		Response res =authService .signUp(signupReq);
		
		System.out.println(res.asPrettyString());
		
		Assert.assertEquals(res.statusCode(), 500);
		
	}

}
