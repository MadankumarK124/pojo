package BDD_operation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import random.random_method;

import static io.restassured.RestAssured.*;

public class put_using_text_ {
@Test
public void put()
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
	.contentType(ContentType.TEXT)
	.when()
	.put("/projects/TY_PROJ_3204")
	.then().assertThat().contentType(ContentType.JSON).log().all();
	
}
}
