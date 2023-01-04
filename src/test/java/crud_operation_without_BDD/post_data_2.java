package crud_operation_without_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import random.random_method;

public class post_data_2 {

	@Test
	public void add()
	{
		random_method ran = new random_method();
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "madan");
		obj.put("projectName", "madan"+ran.random());
		obj.put("status", "pass");
		obj.put("teamSize", 10);
		
		RequestSpecification rest = RestAssured.given();
		//requestSpecification
		rest.body(obj);
		rest.contentType(ContentType.JSON);
		//actions
		Response resp = rest.post("http://localhost:8084/addProject");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		resp.then().assertThat().statusCode(201).log().all();
		
		
	}

}
