package practice_pro;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class serialization_pojo {
	@Test
	public void pojo1() throws Throwable, Throwable, Throwable
	{
		String[] s= {"maddy@123","maddy@234"};
		int[] phone= {12345, 98765};
		pojo_class_ po = new pojo_class_("maddy", "tyss123", s, phone, "mysore");
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./madan.json"), po);
	}
}
