package request_chaining;

import org.testng.annotations.Test;

import different_ways_post.pojo_2;
import different_ways_post.pojo_post;
import generic_utility.random_method;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class post_get_request_chaining {
@Test
public void post()
{
	//post opertion using BDD
	baseURI="http://localhost";
	port=8084;
	random_method ran = new random_method();
	pojo_post pojo = new pojo_post("madan", "mk123"+ran.random(), "pass", 12);
	   Response resp = given()
			  .body(pojo)
			  .contentType(ContentType.JSON)
			  
			  .when()
			  .post("/addProject");
			  
			  
			  //using same data passing that data into another request
			  String proid = resp.jsonPath().get("projectId");
			  given()
			  .pathParam("pid", proid)
			 . when()
			  .get("/projects/{pid}")
			  .then()
			  .assertThat().statusCode(200).log().all();
			  
			  
			   
	
}
}
