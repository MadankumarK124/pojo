package BDD_operation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class get_all_without_port {
@Test
public void get()
{
	baseURI="http://localhost";
	when()
	.get("/projects")
	.then().assertThat().statusCode(403);
	
	
}
}
