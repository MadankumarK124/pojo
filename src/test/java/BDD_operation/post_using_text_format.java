package BDD_operation;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;

import io.restassured.http.ContentType;
import random.random_method;

public class post_using_text_format {

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
		.contentType(ContentType.TEXT)
		
		.when()
		
		.post("/addProject")
		.then().assertThat().contentType(ContentType.JSON).log().all();
		
		
				

	}

}
