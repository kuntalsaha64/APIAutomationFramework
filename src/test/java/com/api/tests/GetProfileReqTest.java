package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginReq;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileReqTest {

	@Test(description = "Verify if get profile API is working")
	public void getProfileInfoTest() {

		AuthService authService = new AuthService();
		Response res = authService.login(new LoginReq("uday1234", "uday12345"));
		LoginResponse loginResponse =  res.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());

		
		UserProfileManagementService userProfile = new UserProfileManagementService();
		Response res1 =  userProfile.getProfile(loginResponse.getToken());
		UserProfileResponse userprofileRes = res1.as(UserProfileResponse.class);
		
		
		System.out.println(userprofileRes.getUsername());
		System.out.println(userprofileRes.getMobileNumber());
	}
}
