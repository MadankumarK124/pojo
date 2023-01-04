package validation;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class validate_header_ {
@Test
public void header()
{
	baseURI="http://localhost";
	port=8084;
	given()
	.get("/projects")
	.then().log().all().assertThat().statusCode(200)
	.and()
	.contentType(ContentType.JSON)
	.and()
	.assertThat().header("Content-Type", "application/json");
	
}
}
