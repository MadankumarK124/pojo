package BDD_operation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import random.random_method;

import static io.restassured.RestAssured.*;

public class post_without_API {
@Test
public void post()
{
	baseURI="http://localhost";
	port=8084;
	
	random_method ran=new random_method();
	JSONObject obj=new JSONObject();
			obj.put("createdBy", "madan");
			obj.put("projectName", "pro"+ran.random());
			obj.put("status", "end");
			obj.put("teamSize", 10);
			
			given()
			
			.body(obj)
			.contentType(ContentType.JSON)
			
			.when()
			
			.post("/")
			.then().assertThat().contentType(ContentType.TEXT);
			
		
			
}
}
