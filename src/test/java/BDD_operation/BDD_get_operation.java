package BDD_operation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class BDD_get_operation {
	@Test
	public void get() {
		// capture records
		Response resp = given()
				
		.get("http://localhost:8084/projects");

		String fid = resp.jsonPath().get("[1].projectId");
		System.out.println(fid);
		// pass to another
		given().pathParam("fid1", fid).get("http://localhost:8084/projects/{fid1}")
				// console to print
				.then().log().all();

	}
}
