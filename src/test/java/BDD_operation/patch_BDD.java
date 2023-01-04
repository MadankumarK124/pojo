package BDD_operation;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class patch_BDD {

	public static void main(String[] args) {
baseURI="http://localhost";
port=8084;
		//prerequest
		given()
		.delete("/projects/TY_PROJ_2820")
		
		//validation
		.then().assertThat().contentType(ContentType.JSON)
		.log().all();
		
		

	}

}
