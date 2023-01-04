package post_different_ways;

import org.testng.annotations.Test;

import different_ways_post.pojo_post;
import io.restassured.http.ContentType;
import random.random_method;

import static io.restassured.RestAssured.*;

public class posting_data_using_pojoclass {
@Test
public void post()
{
	baseURI="http://localhost";
	port=8084;
	random_method ran=new random_method();
	pojo_post pojo= new pojo_post("madan", "pojo12"+ran.random(), "pass", 123);
	given()
	.body(pojo)
	.contentType(ContentType.JSON)
	
	.when()
	.post("/addProject")
	
	.then().assertThat().statusCode(201).log().all();
}
}
