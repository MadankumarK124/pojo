package restassurd_crud_opertaion_using_baseclass;

import javax.annotation.meta.When;

import org.testng.annotations.Test;

import Base_class.base_class_withreqsp;
import generic_utility.endPoints;

import static io.restassured.RestAssured.*;

public class get_operation extends base_class_withreqsp {
@Test
public void get()
{
	given()
	.spec(reqspec)
	.when()
	.get(endPoints.getALLproject)
	.then().statusCode(200).and().log().all();
}
}
