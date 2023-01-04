package validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class validate_body_statusLine {
@Test
public void statusLine()
{
	baseURI="http://localhost";
	port=8084;
	String expected="HTTP/1.1 200";
	Response resp = when()
	.get("projects");
	String actual = resp.getStatusLine();
	Assert.assertNotEquals(actual, expected);
	System.out.println(resp.getStatusCode());
	
		
}
}
