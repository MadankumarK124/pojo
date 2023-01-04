package BDD_operation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

public class get_without_port {
@Test
public void get()
{
	baseURI="http://localhost";
	
	given()
	.get("/projects/TY_PROJ_826")

	.then().assertThat().statusCode(403).log().all();
}
}
