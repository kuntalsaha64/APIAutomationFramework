package com.api.base;


import static io.restassured.RestAssured.*;

import com.api.filters.LoggingFilter;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	private static final String BASE_URL = "https://swift.techwithjatin.com";
	private RequestSpecification reqSpec;
	
	static {
		RestAssured.filters(new LoggingFilter());
	}
	
	public BaseService() {
		reqSpec = given().baseUri(BASE_URL);
	}
	
	protected void setAuthtoken(String token) {
		reqSpec.header("Authorization", "Bearer " + token);
	}
	
	protected Response postReq(Object payload, String endpoint) {
		return reqSpec.contentType(ContentType.JSON).body(payload).post(endpoint); 
	}
	
	protected Response getReq(String endpoint) {
		return reqSpec.get(endpoint);
	}
	
	protected Response putReq(Object payload, String endpoint) {
		return reqSpec.contentType(ContentType.JSON).body(payload).put(endpoint);
	}
}
