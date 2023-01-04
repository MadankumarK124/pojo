package pojo_script;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoCLassForSerilizationDeserilization.Employee_details_1_str_array;

public class pojo_string_emp_serilization {
	@Test
	public void pojoString() throws Throwable, Throwable, Throwable
	{
		//initilize string array
		String[] s= {"mada@123","madan@1345"};
		//create an object of pojo class
		Employee_details_1_str_array emp = new Employee_details_1_str_array("madan", "tyss123", s, 12345, "banglore");
		//create an object of objectmapper
		ObjectMapper map = new ObjectMapper();
		//write data to json
		map.writeValue(new File("./dataemp3.json"), emp);
	}

}
