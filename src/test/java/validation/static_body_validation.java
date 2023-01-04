package validation;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class static_body_validation {
	@Test
	public void validate() {
		String expectedid = "mission_vk";
		Response data = when().get("http://localhost:8084/projects");
		String actual = data.jsonPath().get("[0].projectName ");
		Assert.assertEquals(actual, expectedid);
	
	}
}
