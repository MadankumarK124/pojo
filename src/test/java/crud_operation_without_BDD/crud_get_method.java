package crud_operation_without_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class crud_get_method {
@Test
public void get()
{
	Response rest = RestAssured.get("http://localhost:8084/projects/TY_PROJ_2803");
	System.out.println(rest.getStatusCode());
	System.out.println(rest.getStatusLine());
	
	
}
}
