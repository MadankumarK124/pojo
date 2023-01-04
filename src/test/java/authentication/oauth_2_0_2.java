package authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static  io.restassured.RestAssured.*;

public class oauth_2_0_2 {
@Test
public void oauth20()
{
	  Response resp = given()
	.formParam("client_id", "madan123")	
	.formParam("client_secret", "fa36b185cbe4ece6d567f4491a8676ab")
	.formParam("grant_type", "client_credentials")
	.formParam("redirect_uri", "http://madan.com")
	.formParam("code", "authorization code")
	
	.when()
	.post(" http://coop.apps.symfonycasts.com/token ");
	System.out.println(resp);
	String token = resp.jsonPath().get("access_token");
	System.out.println(token);
	
	given()
	.auth().oauth2(token)
	.pathParam("User_Id", "4160")
	.when()
	.post("http://coop.apps.symfonycasts.com/api/{User_Id}/toiletseat-down")
	.then().log().all();
}
}
