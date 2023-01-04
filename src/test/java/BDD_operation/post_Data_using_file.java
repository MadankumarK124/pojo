package BDD_operation;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class post_Data_using_file {
@Test
public void post()
{
	File f1=new File(".\\src\\test\\resources\\data12.json");
	given()
	.body(f1)
	.contentType(ContentType.JSON)
	
	.when()
	.post("http://localhost:8084/addProject")
.then().assertThat().statusCode(201).log().all();
}
}
