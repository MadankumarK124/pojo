package Base_class;


import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import generic_utility.DataBaseUtility;
import generic_utility.excelUtility;
import generic_utility.random_method;
import generic_utility.restassuredLibrary;
import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class base_class_withreqsp {
	public random_method jlib=new random_method();
	public excelUtility elib=new excelUtility();
	public restassuredLibrary rlib=new restassuredLibrary();
	public DataBaseUtility dlib=new DataBaseUtility();
	public RequestSpecification reqspec;
	public ResponseSpecification respspec;
	/**
	 * RequestSpecification and ResponseSpecification are classes in restassuered library
	 * with the help of which we can store some common Actions in both request and response
	 * @throws Throwable
	 */
	@BeforeSuite
	public void BSconfig() throws Throwable
	{
		
		dlib.dataBAse();
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("http://localhost");
		builder.setPort(8084);
		builder.setContentType(ContentType.JSON);
		reqspec=builder.build();
	}
	@AfterSuite
	public void ASconfig() throws Throwable
	{
		
		ResponseSpecBuilder spec = new ResponseSpecBuilder();
		respspec=spec.expectContentType(ContentType.JSON).build();
		dlib.closeDataBase();
	}
}
