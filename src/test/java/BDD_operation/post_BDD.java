package BDD_operation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import random.random_method;

import static io.restassured.RestAssured.*;

public class post_BDD {

	@Test
	public void post() {
		baseURI="http://localhost:8084";
		port=8084;
		random_method ran = new random_method();
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "madan");
		obj.put("projectName", "madan1234568899" + ran.random());
		obj.put("status", "pass");
		obj.put("teamSize", 10);

		given().body(obj).contentType(ContentType.JSON).when()

				.post("/addProject")
				.then().assertThat().statusCode(201)
				.log().all();
				

	}

}
