package validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class time_validation {
@Test
public void time()
{
	given()
	.get("http://localhost:8084/projects")
	
	.then()
	.assertThat().statusCode(200).and().time(Matchers.lessThan(5l), TimeUnit.SECONDS);
	
	//or
	long time = given()
			.get("http://localhost:8084/projects")
			.timeIn(TimeUnit.MILLISECONDS);
			System.out.println(time);
	
	
}
}
