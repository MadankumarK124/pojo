package authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class oauth2_0 {
	@Test
	public void authentication() {
		Response resp = given()
				.formParam("client_id", "madan")
				.formParam("client_secret", "66f7eae18cb04ce932555de4f716a157")
				.formParam("grant_type", "client_credentials")
				.formParam("redirect_uri", "https://madan.com")
				.formParam("code", "authorization_code")

				.when()

				.post("http://coop.apps.symfonycasts.com/token");
		System.out.println(resp);
		// capture the access token from the respone of the request
		String acc = resp.jsonPath().get("access_token");
		System.out.println(acc);

		given()
		.auth().oauth2(acc)
		.pathParam("user_Id",4160)
        .when()
        .post("http://coop.apps.symfonycasts.com/api/{user_Id}/chickens-feed")
        .then().log().all();

	}

}