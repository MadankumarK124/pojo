package pojo_script;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoCLassForSerilizationDeserilization.Spouse;

public class Spouse_serilization {

	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		Spouse sp = new Spouse("poojahegde", "kawazakih2");
		ObjectMapper map = new ObjectMapper();
		map.writeValue(new File("./spousedata.json"), sp);

	}

}
