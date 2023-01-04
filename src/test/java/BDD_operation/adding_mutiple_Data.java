package BDD_operation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured .*;
import random.random_method;

public class adding_mutiple_Data {
@Test
public void data()
{
//	baseURI="http:localhost";
//	port=8084;
	random_method ran=new random_method();
	JSONObject obj=new JSONObject();
	obj.put("createdBy", "madan");
	obj.put("projectName", "car"+ran.random());
	obj.put("status", "pass");
	obj.put("teamSize", 10);
	
	 given()
	.body(obj)
	.contentType(ContentType.JSON)
	
	
	.post("http://localhost:8084/addProject")
	
	.then().assertThat().statusCode(201)
	.log().all();
	
	
}
}
