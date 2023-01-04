package BDD_operation;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import random.random_method;

import static io.restassured.RestAssured.*;

public class add_2_object_in_one_body {
@Test
public void add()
{
	random_method ran=new random_method();
	baseURI="http://localhost";
	port=8084;
	JSONObject obj=new JSONObject();
	obj.put("createdBy", "madan");
	obj.put("projectName", "rand"+ran.random());
	obj.put("status", "pass");
	obj.put("teamSize", 10);
	
	obj.put("createdBy", "madhu");
	obj.put("projectName", "rand"+ran.random());
	obj.put("status", "pass");
	obj.put("teamSize", 20);

	given()
	.body(obj).contentType(ContentType.JSON)
	
	.when()
	.post("/addProject")
	
	.then().assertThat().statusCode(201).log().all();
	
	
	
	
}
}
