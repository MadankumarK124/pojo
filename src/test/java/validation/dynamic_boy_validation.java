package validation;

import org.testng.Assert;
import org.testng.annotations.Test;



import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class dynamic_boy_validation {
@Test
public void dynamic()
{
	baseURI="http://localhost";
	port=8084;
	String expected="TY_PROJ_3603";
	Response data = when().get("projects");
	List<String>actual = data.jsonPath().get("projectId");
	boolean flag=false;
	for(String lv:actual)
	{
		if(lv.equalsIgnoreCase(expected))
		{
			System.out.println("data id is  found");
			flag=true;
		}
	}
	Assert.assertTrue(flag);
			
}
}
