package request_chaining;

import org.testng.annotations.Test;

import different_ways_post.pojo_post;
import generic_utility.random_method;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class req_post_get_delet_ {
@Test
public void post()
{
	//post
	baseURI="http://localhost";
	port=8084;
	random_method rand = new random_method();
	pojo_post pojo = new pojo_post("madan", "mk123"+rand.random(), "conti", 1);
	 Response resp = given()
			.body(pojo)
			.contentType(ContentType.JSON)
			
			.when()
			.post("/addProject");
	 
	 
	//get
	  String proid = resp.jsonPath().get("projectId");
	  System.out.println(proid);
	 given()
	 .pathParam("pid", proid)
	 .when()
	 .get("/projects/{pid}")
	 .then().assertThat().statusCode(200).log().all();
	 
	 //delete
	 String proid1 = resp.jsonPath().get("projectId");
	 System.out.println(proid1);
	 given()
	 .pathParam("pid1",proid1)
	.when()
	 .delete("/projects/{pid1}")
	 .then().assertThat().statusCode(204).and().log().all();	 
	
			
}
}
