package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginReq;
import com.api.models.request.UpdateProfileReq;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {

	@Test(description = "Verify if update profile API is working")
	public void getProfileInfoTest() {

		AuthService authService = new AuthService();
		Response res = authService.login(new LoginReq("uday1234", "uday12345"));
		LoginResponse loginResponse = res.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
		
		System.out.println("--------------------------------------------------------");
		
		UserProfileManagementService userProfileMng = new UserProfileManagementService();
		UpdateProfileReq updateProf = new UpdateProfileReq.Builder().firstname("Uday")
			.lastname("Uday2")
			.mobilenum("1234567890")
			.email("bac@gmail.com").build();
			
		Response res1 = userProfileMng.updateProfile(loginResponse.getToken(), updateProf);
		System.out.println(res1.asPrettyString());
		
	}
}
