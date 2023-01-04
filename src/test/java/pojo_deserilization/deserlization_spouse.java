package pojo_deserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoCLassForSerilizationDeserilization.Spouse;

public class deserlization_spouse {

	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		ObjectMapper map = new ObjectMapper();
		Spouse data = map.readValue(new File("./spousedata.json"), Spouse.class);
		System.out.println(data.getBikeName());
		System.out.println(data.getWifeName());

	}

}
