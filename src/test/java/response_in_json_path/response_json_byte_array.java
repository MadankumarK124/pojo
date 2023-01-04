package response_in_json_path;

import java.io.File;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class response_json_byte_array {
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

		// Converting in to byte array before writing
		byte[] getByte = resp.asByteArray();
		// Creating a target file
		File targetFile = new File(".\\src\\test\\resources\\bytearray.json");
		// Writing into files
		Files.write(getByte, targetFile);

	}
}
