package BDD_operation;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import random.random_method;

import static io.restassured.RestAssured.*;

public class request_without_port {
@Test
public void post()
{
	baseURI="http://localhost";
	
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
	.post("/addProject")
	
	.then().assertThat().contentType(ContentType.JSON)
	.assertThat().statusCode(500);
	
}
}
