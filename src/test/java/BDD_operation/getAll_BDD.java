package BDD_operation;

import static io.restassured.RestAssured .*;

import io.restassured.http.ContentType;

public class getAll_BDD {

	public static void main(String[] args) {
		//reqspf
		given()
		.get("http://localhost:8084/projects")
		//validation
		.then().assertThat().contentType(ContentType.JSON).statusCode(200)
		
		.log().all();
		
		
	}

}
