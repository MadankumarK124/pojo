package post_different_ways;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import different_ways_post.pojo_post;
import io.restassured.http.ContentType;
import random.random_method;

import static io.restassured.RestAssured .*;

public class data_Driven_testing {
@DataProvider
public Object[][] data()
{
	random_method ran=new random_method();
	Object[][] obj = new Object[2][4];
	obj[0][0]="madan";
	obj[0][1]="pogo"+ran.random();
	obj[0][2]="created";
	obj[0][3]=10;
	obj[1][0]="madan";
	obj[1][1]="cartoon12"+ran.random();
	obj[1][2]="created";
	obj[1][3]=10;
	return obj;
}
@Test(dataProvider = "data")
public void tv(String createdBy, String projectName, String status, int teamSize )
{
	pojo_post pojo=new pojo_post(createdBy, projectName, status, teamSize);
	given()
	.body(pojo)
	.contentType(ContentType.JSON)
	
	.when()
	.post("http://localhost:8084/addProject")
	
	.then().assertThat().statusCode(201).log().all();
}

}
