package RestAssured;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class PutRequest {

	@Test
		public void putId(){
		
	given().
	baseUri("https://thetestingworldapi.com").
	header("Content-Type","application/json").
	body("{\r\n"
			+"   \"id\": 3353396,\r\n"
			+ "  \"first_name\": \"rest\",\r\n"
			+ "  \"middle_name\": \" api\",\r\n"
			+ "  \"last_name\": \"selenium\",\r\n"
			+ "  \"date_of_birth\": \"01/01/1001\"\r\n"
			+ "}").
	when().
	 put("/api/studentsDetails/3353396").
	then().
	assertThat().
	statusCode(200).
	log().all();
		
	/*	given().
		baseUri("https://thetestingworldapi.com").
	header("Content-Type","application/json").	
	body("{\r\n"
			+ "        \"id\": 1138627,\r\n"
			+ "        \"first_name\": \"Lukeshtest\",\r\n"
			+ "        \"middle_name\": \"Test\",\r\n"
			+ "        \"last_name\": \"Nehete\",\r\n"
			+ "        \"date_of_birth\": \"03/03/1994\"\r\n"
			+ "    }").
	when().
		put("/api/studentsDetails/1138627").
	then().
		assertThat().
		statusCode(200).
		log().all(); */
	
	
}
}