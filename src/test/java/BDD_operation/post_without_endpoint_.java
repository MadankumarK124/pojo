package BDD_operation;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import random.random_method;

public class post_without_endpoint_ {
	@Test
	public void post()
	{
		baseURI="http://localhost";
		port=8084;
		random_method ran=new random_method();
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "madan");
		obj.put("projectName", "rand"+ran.random());
		obj.put("status", "pass");
		obj.put("teamSize", 10);
		
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/")
		
		.then().assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(403).log().all();
	}
}
