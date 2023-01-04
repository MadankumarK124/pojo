package response_in_json_path;

import java.io.File;
import java.io.InputStream;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class response_json_inputstream_write_into_file {
	public static void main(String[] args) throws Throwable {
		// There is no need to add escape character manually. Just paste string within
		// double
		// quotes. It will automatically add escape sequence as required.
		String jsondata = "{\"username\":\"admin\",\"password\":\"password123\"}";

		// Create a request specification
		RequestSpecification req = RestAssured.given();
		// Setting content type to specify format in which request payload will be sent.
		// ContentType is an ENUM.
		req.contentType(ContentType.JSON);
		// Adding URI
		req.baseUri("https://restful-booker.herokuapp.com/auth");
		// Adding body as string
		req.body(jsondata);
		// Calling POST method on URI. After hitting we get Response
		Response resp = req.post();
		// Getting response as input stream and writing in to a file
		InputStream respon = resp.asInputStream();
		// Creating a byte array with number of bytes of input stream
		// (available()method)
		byte[] respAsInputByteStream = new byte[respon.available()];
		// Reads number of bytes from the input stream and stores them into the byte
		// array responseAsInputStreamByte.
		respon.read(respAsInputByteStream);
		// Creating a target file
		File targetfileforInputStream = new File(".\\src\\test\\resources\\file.json");
		// Writing into files
		
		Files.write(respAsInputByteStream, targetfileforInputStream);
	}
}