package pojo_script;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoCLassForSerilizationDeserilization.Employee_details_1Str_1int_1_obj;
import pojoCLassForSerilizationDeserilization.Spouse;

public class pojo_For_Int_String_Array {
	@Test
	public void pojo() throws Throwable, Throwable, Throwable
	{
		//inilitize String array
		String[] s= {"madan@123","madan@234"};
		//initilize int array
		int[] phone= {1234, 87987};
		//create an object of spouse
		Spouse s1=new Spouse("poojaHegde", "kawazakih2");
		//create an object pojo
		Employee_details_1Str_1int_1_obj emp = new Employee_details_1Str_1int_1_obj("madan", "tyss123", s, phone, "brazil", s1);
		//create an object mapper
		ObjectMapper map = new ObjectMapper();
		//write data into json
		map.writeValue(new File("./combined.json"), emp);
		
		
	}

}
