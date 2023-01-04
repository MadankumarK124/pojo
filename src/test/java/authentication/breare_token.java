package authentication;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import generic_utility.random_method;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class breare_token {
@Test
public void bearer()
{
	baseURI="https://api.github.com";
	random_method ran=new random_method();
	JSONObject obj=new JSONObject();
	obj.put("name", "KING1"+ran.random());
	
	given()
	.auth()
	.oauth2("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")
	
	.body(obj)
	.contentType(ContentType.JSON)
	
	.when()
	.post("/user/repos")
			
	.then().assertThat().statusCode(201).log().all();
	
}
}
