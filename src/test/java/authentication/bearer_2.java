package authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic_utility.random_method;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class bearer_2 {
@Test
public void bearer()
{
	random_method ran=new random_method();
	baseURI="https://api.github.com";
	JSONObject obj=new JSONObject();
	obj.put("name", "king12"+ran.random());
	
	given()
	.auth()
	.oauth2("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")
	.body(obj)
	.contentType(ContentType.JSON)
	.when()
	.post("/user/repos")
	
	.then().assertThat().statusCode(201).and().log().all();
			
}
}
