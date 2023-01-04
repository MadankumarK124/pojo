package fileupload_multi_part;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import  io.restassured.RestAssured;

public class multi_part {
@Test
public void fileupload()
{
	File f1=new File(".\\src\\test\\resources\\virat.webp");
	 Response rest = RestAssured.given()
	.multiPart("file", f1, "multipart/form-data")
	.post("https://the-internet.herokuapp.com/upload")
	.thenReturn();
	System.out.println(rest.prettyPrint());
	
}
}
