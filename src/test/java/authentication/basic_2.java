package authentication;

import static io.restassured.RestAssured.*;

public class basic_2 {

	public static void main(String[] args) {
		baseURI="http://localhost";
		port=8084;
		
		given()
		.auth().basic("rmgyantra", "rmgy@9999")
		
		.when()
		.get("/login")
		
		.then().assertThat().statusCode(202).log().all();
		
	}

}
