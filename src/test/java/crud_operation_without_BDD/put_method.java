package crud_operation_without_BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import random.random_method;

public class put_method {
	@Test
	public void put() {
		random_method ran = new random_method();
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "madan");
		obj.put("projectName", "madadana"+ran.random());
		obj.put("status", "done");
		obj.put("teamSize", 100);

		RequestSpecification rest = RestAssured.given();
		rest.body(obj);
		rest.contentType(ContentType.JSON);
		Response resp = rest.put("http://localhost:8084/projects/TY_PROJ_2806");
		resp.then().assertThat().contentType(ContentType.JSON);
		System.out.println(resp.getStatusCode());
		resp.then().log().all();
		//System.out.println(resp.getHeader(""));
	}

}
