package restassurd_crud_opertaion_using_baseclass;
 
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Base_class.base_class_withreqsp;
import different_ways_post.pojo_post;
import generic_utility.endPoints;
import generic_utility.random_method;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class put extends base_class_withreqsp{
@Test
public void put()
{
	random_method ran = new random_method();
	JSONObject obj=new JSONObject();
	obj.put("createdy", "madan");
	obj.put("projectName", "madan"+ran.random());
	obj.put("status", "pass");
	obj.put("teamSize", 2);
	 given()
	.spec(reqspec)
	.body(obj)
	.pathParam("resp", "TY_PROJ_4606")
	.when()
	.put(endPoints.Updateproject+"{resp}")
	.then().assertThat().statusCode(200).log().all();
	
	
	
	
	
	
}
}
