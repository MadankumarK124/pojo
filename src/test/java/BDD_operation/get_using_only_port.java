package BDD_operation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class get_using_only_port {
@Test
public void get() {
	baseURI="http://localhost";
	port=8084;
	given()
	.get("/projects")
	
	.then().assertThat().statusCode(200).log().all();
}
}
