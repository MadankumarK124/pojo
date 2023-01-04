package end_to_end;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base_class.base_class_withreqsp;
import different_ways_post.pojo_post;
import generic_utility.endPoints;
import generic_utility.random_method;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class post_opertaion extends base_class_withreqsp {
@Test
public void post() throws Throwable
{
	random_method ran = new random_method();
	pojo_post pojo = new pojo_post("madan", "mada"+ran.random(), "pass", 1);
	Response resp = given()
			.spec(reqspec)
	.body(pojo)

	
	.when()
	.post(endPoints.createdproject);
	//capture the response and retrive the projectId
	String expData = rlib.getjsondata(resp, "projectId");
	System.out.println(expData);
	
	//connect to the database and verify the project
	String query= "select * from project;";
	System.out.println(query);
	String actaldata = dlib.executeQueryandgetData(query, 1, expData);
	System.out.println(actaldata);
	
	//validate
	Assert.assertEquals(actaldata, expData);
}
}
