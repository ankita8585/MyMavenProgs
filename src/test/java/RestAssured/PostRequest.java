package RestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class PostRequest {
	
	@Test
	public void postId()
	{
		given().
		baseUri("https://thetestingworldapi.com").
	header("Content-Type","application/json").	
	body("{\r\n"
			+ "        \"first_name\": \"Lukesh\",\r\n"
			+ "        \"middle_name\": \"Test\",\r\n"
			+ "        \"last_name\": \"Nehete\",\r\n"
			+ "        \"date_of_birth\": \"03/03/1995\",\r\n}").
	body("{\r\n"
			
			+ "     \"first_name\": \"mukesh\",\r\n"
						+ "        \"middle_name\": \"Taste\",\r\n"
						+ "        \"last_name\": \"Naina\",\r\n"
						+ "        \"date_of_birth\": \"06/03/1995\",\r\n}"
			).
	when().
		post("/api/studentsDetails").
	then().
		assertThat().
		statusCode(201).
		log().all();
	}
}
