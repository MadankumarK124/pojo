package BDD_operation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.http.ContentType.*;
import random.random_method;

public class put_one_project {
@Test
public void put()
{
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
	.contentType(ContentType.JSON)
	
	.when()
	
	.post("/addProject")
	.then().header("data", "monday").assertThat().contentType(ContentType.JSON).log().all();
	

	
}
}
