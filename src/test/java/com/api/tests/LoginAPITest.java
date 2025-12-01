package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginReq;
import com.api.models.response.LoginResponse;

//import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListeners.class)
public class LoginAPITest {

	
	@Test(description = "Verify if login API is working")
	public void loginTest() {
//		Response r =  given().baseUri("https://swift.techwithjatin.com")
//			.header("Content-type", "application/json")
//			.body("{\"username\": \"uday1234\", \"password\": \"uday12345\"}")
//			.post("/api/auth/login");
//		System.out.println(r.asPrettyString());
//		Assert.assertEquals(r.getStatusCode(), 200);
		
		LoginReq loginReq = new LoginReq("uday1234", "uday12345");
		AuthService a =new AuthService();
		Response r = a.login(loginReq);
		LoginResponse loginRes = r.as(LoginResponse.class);
		
		System.out.println(r.asPrettyString());
		System.out.println(loginRes.getToken());
		System.out.println(loginRes.getEmail());
		System.out.println(loginRes.getRoles());
		Assert.assertTrue(loginRes.getToken() != null);
//		Assert.assertEquals(loginRes.getEmail(), "abc@gmail.com");
	}
}
