package BDD_operation;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.http.ContentType .*;
import random.random_method;

public class put_BDD {

	public static void main(String[] args) {
		random_method ran=new random_method();
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "madan");
		obj.put("projectName", "hrasgh"+ran.random());
		obj.put("status", "pass");
		obj.put("teamSize", 12);
		
		 given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.put("http://localhost:8084/projects/TY_PROJ_2817")
		.then().log().all();
		
		
		


	}

}
