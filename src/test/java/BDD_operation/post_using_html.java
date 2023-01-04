package BDD_operation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import random.random_method;

public class post_using_html {

	public static void main(String[] args) {
		baseURI="https://localhost";
		port=8084;
		
		random_method ran=new random_method();
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "madan");
		obj.put("projectName", "pro"+ran.random());
		obj.put("status", "end");
		obj.put("teamSize", 10);
		
		given()
		
		.body(obj)
		.contentType(ContentType.HTML)
		
		.when()
		
		.post("/addProject")
		.then().assertThat().contentType(ContentType.JSON).log().all();
		
		
				


	}

}
