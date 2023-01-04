package parameters;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class path_parameter {

	public static void main(String[] args) {
		baseURI = "http://localhost";
		port = 8084;
		String pid = "TY_PROJ_002";
		given().
		pathParam("projectId", pid).
		get("/projects/{projectId}").then()
        .assertThat().statusCode(200).log().all();

	}

}
