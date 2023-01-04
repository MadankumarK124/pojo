package practice_pro;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class spouse_serilization {
@Test
public void pojo2() throws Throwable, Throwable, Throwable
{
	spouse_class po = new spouse_class("madan", 1234);
	ObjectMapper map = new ObjectMapper();
	map.writeValue(new File("./madan2.json"), po);
}
}
