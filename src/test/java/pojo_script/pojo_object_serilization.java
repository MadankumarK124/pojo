package pojo_script;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoCLassForSerilizationDeserilization.EmployeeDetailsPojo;
import pojoCLassForSerilizationDeserilization.Spouse;

public class pojo_object_serilization {
@Test
public void object() throws Throwable, Throwable, Throwable
{
	//create an object of spouse class
	Spouse s=new Spouse("poojaHegde", "kawazakih2");
	//create an object of pojo class
	EmployeeDetailsPojo pojo = new EmployeeDetailsPojo("madan", "TYSS1234", "maddy@123", 1234567799, "newzeland");
	//create an object of objectMApper
	ObjectMapper map = new ObjectMapper();
	//write data into json file
	map.writeValue(new File("./dataspouse.json"), pojo);
}

}
