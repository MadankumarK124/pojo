package restassurd_crud_opertaion_using_baseclass;

import org.testng.annotations.Test;

import Base_class.base_class_withreqsp;
import generic_utility.endPoints;

import static io.restassured.RestAssured.*;

public class get_single_  extends base_class_withreqsp {
@Test
public void singleget ()
{
	given()
	.spec(reqspec)
	.pathParam("pid", "TY_PROJ_4606")
	.when()
	.get(endPoints.getProject+"{pid}")
	.then().assertThat().statusCode(200).log().all();
}
}
