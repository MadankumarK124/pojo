package validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class validate_Response_body {
	@Test
	public void response() {

		given()

				.get("http://localhost:8084/projects").then().log().all().and()
				.body("[0].createdBy", Matchers.equalTo("madan_vk"));
					

	}
}
