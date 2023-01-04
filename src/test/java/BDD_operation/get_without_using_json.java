package BDD_operation;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class get_without_using_json {
@Test
public void get()
{
	baseURI="http://localhost";
	port=8084;
	given()
	.get("/projects/TY_PROJ_826")

	.then().assertThat().statusCode(200).contentType(ContentType.TEXT).statusCode(403).log();
}
}
