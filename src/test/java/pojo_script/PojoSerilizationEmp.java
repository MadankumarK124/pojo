package pojo_script;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoCLassForSerilizationDeserilization.EmployeeDetailsPojo;

public class PojoSerilizationEmp {
@Test
public void pojoserilization() throws Throwable, Throwable, Throwable
{
	//create an object of object class
	EmployeeDetailsPojo pojo = new EmployeeDetailsPojo("madan", "TYSS123", "madan@123", 123456, "mysore");
	//create an object of objectMapper
	ObjectMapper map=new ObjectMapper();
	//write the value to the json file
	map.writeValue(new File("./empdata.json"), pojo);
}
}
