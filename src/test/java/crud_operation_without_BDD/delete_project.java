package crud_operation_without_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class delete_project {
@Test
public void delete()
{
	Response rest = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_2813");
	//System.out.println(rest.statusCode());
	rest.then().assertThat().statusCode(204);
	
	
	
}
}
