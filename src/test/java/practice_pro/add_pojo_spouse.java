package practice_pro;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class add_pojo_spouse {
	@Test
	public void pojo3() throws Throwable, Throwable, Throwable
	{
		String[] s= {"madan@123","maddy987"};
		int[] number= {1234,9876};
		spouse_class sp = new spouse_class("madan12345", 12345677);
		pojo_class_ mojo = new pojo_class_("madan", "tys123", s, number, "mysuru");
		ObjectMapper map = new ObjectMapper();
		map.writeValue(new File("./alldata.json"), mojo);
	}
}
