package com.api.base;

import java.util.HashMap;

import com.api.models.request.LoginReq;
import com.api.models.request.SignUpReq;

import io.restassured.response.Response;

public class AuthService extends BaseService{

	private static final String BASE_PATH = "/api/auth/";
	
	public Response login(LoginReq payload) {
		return postReq(payload, BASE_PATH + "login");
	}
	
	public Response signUp(SignUpReq payload) {
		return postReq(payload, BASE_PATH + "signup");
	}
	
	public Response forgotPassword(String email) {
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email", email);
		return postReq(payload, BASE_PATH + "forgot-password");
	}
}
