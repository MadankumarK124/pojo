package restassurd_crud_opertaion_using_baseclass;

import org.apache.poi.poifs.crypt.temp.AesZipFileZipEntrySource;
import org.testng.annotations.Test;

import Base_class.base_class_withreqsp;
import different_ways_post.pojo_post;
import generic_utility.endPoints;
import generic_utility.restassuredLibrary;
import static  io.restassured.RestAssured.*;

public class fetching_id_from_excel extends base_class_withreqsp {
@Test
public void get() throws Throwable
{
	
	String ex = elib.excel("sheet", 0, 0);
	System.out.println(ex);
	
	given()
	.spec(reqspec)
	.pathParam("ex1", ex)
	.when()
	.get(endPoints.getProject+"{ex1}")
	.then().assertThat().log().all();
	
}
}
