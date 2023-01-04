package BDD_operation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import random.random_method;

import static io.restassured.RestAssured.*;

public class post_using_html_formate {
@Test
public void post()
{
	baseURI="http://localhost";
	port=8084;
	random_method ran=new random_method();
	JSONObject obj=new JSONObject();
	obj.put("createdBy", "madan");
	obj.put("projectName", "rand"+ran.random());
	obj.put("status", "pass");
	obj.put("teamSize", 10);
	
	given()
	.body(obj)
	.contentType(ContentType.HTML)
	
	.when()
	.post("/addProject")
	
	.then().assertThat().contentType(ContentType.HTML)
	.assertThat().statusCode(403).header("content-type", "application/json").log();
}
}
