package post_different_ways;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import different_ways_post.pojo_2;
import generic_utility.excelUtility;
import generic_utility.random_method;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class data_Drivern_2 {
	@Test(dataProvider = "provider")
	public void getdata(String createdBy, String projectName, String status, String teamSize) {
		baseURI="http:localhost";
		port=8084;
		random_method ran = new random_method();
		pojo_2 po = new pojo_2(createdBy, projectName, status, teamSize);
		given().body(po).contentType(ContentType.JSON)

				.when()
				.post("/addProject")

				.then().assertThat().statusCode(201).and().log().all();
		

	}

	@DataProvider
	public Object[][] provider() throws Throwable {
		excelUtility elib = new excelUtility();
		Object[][] data = elib.excelData("Sheet1");

		return data;
		
	}

	}