package parameters;

import static io.restassured.RestAssured.*;

public class query_paramater {

	public static void main(String[] args) {
		baseURI="https://reqres.in/";
		
		given()
		.queryParam("page", 2)
		.get("/api/users/")
		.then().log().all();

	}

}
