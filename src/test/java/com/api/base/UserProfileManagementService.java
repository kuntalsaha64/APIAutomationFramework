package com.api.base;


import com.api.models.request.UpdateProfileReq;

import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService{
	
	
private static final String BASE_PATH = "/api/users/";
	
	public Response getProfile(String token) {
		setAuthtoken(token);
		return getReq(BASE_PATH + "profile");
	}
	
	public Response updateProfile(String token, UpdateProfileReq payload) {
		setAuthtoken(token);
		return putReq(payload, BASE_PATH + "profile");
	}

}
