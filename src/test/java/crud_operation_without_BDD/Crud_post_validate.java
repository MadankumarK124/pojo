package crud_operation_without_BDD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import random.random_method;

public class Crud_post_validate {
	@Test
	public void add() {
		// create json body using simple
		random_method ran = new random_method();
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "madan");
		jobj.put("projectName", "hra123455467434" + ran.random());
		jobj.put("status", "pass");
		jobj.put("teamSize", 10);
		// prerequest for the script
		RequestSpecification rest = RestAssured.given();
		rest.body(jobj);
		rest.contentType(ContentType.JSON);
		// action
		Response resp = rest.post("http://localhost:8084/addProject");
		// validation
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getContentType());
		
		resp.then().log().all();
		resp.then().assertThat().contentType(ContentType.JSON);
	}
}
