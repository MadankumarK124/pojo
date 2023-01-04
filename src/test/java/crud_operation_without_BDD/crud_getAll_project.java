package crud_operation_without_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class crud_getAll_project {
@Test
public void getAll()
{
	Response rest = RestAssured.get("http://localhost:8084/projects");
	System.out.println(rest.getStatusCode());
	System.out.println(rest.getContentType());
	rest.then().assertThat().statusCode(200);
	rest.then().log().all();
}
}
