package restassurd_crud_opertaion_using_baseclass;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Base_class.base_class_withreqsp;
import generic_utility.endPoints;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class post_using_baseclass extends base_class_withreqsp {
	@Test
	public void post()
	{
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "madan");
		obj.put("projectName", "man12"+jlib.random());
		obj.put("status", "pass");
		obj.put("teamSize", 1);
		
		given()
		.spec(reqspec)
		.body(obj)
		
		.when()
		.post(endPoints.createdproject)
		
		.then().statusCode(201).log()
		.all();
		
	}

}
