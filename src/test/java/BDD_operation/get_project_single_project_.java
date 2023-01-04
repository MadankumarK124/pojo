package BDD_operation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class get_project_single_project_ {
@Test
public void get()
{
	
		baseURI="http://localhost";
		port=8084;
		given()
		.get("/projects/TY_PROJ_826")
	
		.then().assertThat().statusCode(200).log().all();
	}
}


