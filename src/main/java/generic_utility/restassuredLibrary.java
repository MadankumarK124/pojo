package generic_utility;



import io.restassured.response.Response;

/**
 * this method is return json data from corresponding response body
 * @author madan
 * @param response
 * @paramt path
 * @retrun 
 */
public class restassuredLibrary {
public String getjsondata(Response response,String path )
{
	String  jsdata=response.jsonPath().get(path);
	return jsdata;
	
}


	
}
