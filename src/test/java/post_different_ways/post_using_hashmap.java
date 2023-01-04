package post_different_ways;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import random.random_method;

public class post_using_hashmap {
@Test
public void post()
{
	
	random_method ran=new random_method();
	HashMap map = new HashMap();
	map.put("createdBy", "madan");
	map.put("projectName", "mango"+ran.random());
	map.put("createdBy", "madan");
	map.put("createdBy", "madan");
	
	given()
	.body(map)
	.contentType(ContentType.JSON).when()

	.post("http://localhost:8084/addProject")
	.then().assertThat().statusCode(201)
	.log().all();

}
}
