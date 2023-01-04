package BDD_operation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

import static io.restassured.RestAssured .*;
import random.random_method;

public class add_and_delete {
@Test
public void add()
{
	random_method rand=new random_method();
	JSONObject obj=new JSONObject();
	obj.put("createdBy", "madan");
	obj.put("projectName", "mada"+rand.random());
	obj.put("status", "pass");
	obj.put("teamSize", 10);
	
	given()
	.body(obj)
	.contentType(ContentType.JSON)
	
	.when()
	.post("http://localhost:8084/addProject")
	
	.then().assertThat().contentType(ContentType.JSON)
	.assertThat().statusCode(201).log().all();
	
	 when()
		.delete("http://localhost:8084/projects/TY_PROJ_3006")
		.then().assertThat().statusCode(500).log().all();
	
		
	
	
	
}
}
