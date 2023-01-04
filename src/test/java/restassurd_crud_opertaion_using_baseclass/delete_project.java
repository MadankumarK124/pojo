package restassurd_crud_opertaion_using_baseclass;

import org.testng.annotations.Test;

import Base_class.base_class_withreqsp;
import generic_utility.endPoints;

import static io.restassured.RestAssured.*;

public class delete_project extends base_class_withreqsp{
@Test
public void delete()
{
	given()
	.spec(reqspec)
	.pathParam("path","TY_PROJ_4610")
	.when()
	.delete(endPoints.deleteproject+"{path}")
	.then()
	//.spec(respspec)
	.assertThat().statusCode(204).log().all();
	
}
}
