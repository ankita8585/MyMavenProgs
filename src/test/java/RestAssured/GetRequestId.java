package RestAssured;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class GetRequestId {
	
	@Test
	public void getId() {
		
	String response =given().
			baseUri("http://thetestingworldapi.com").
		when().
			get("/api/studentsDetails/1137285").	
		then().
			assertThat().
			statusCode(200).
			//log().all().
		//	body("last_name", equals("Nehete")).
			extract().response().asString();
		
		System.out.println(response);
		
		JsonPath js = new JsonPath(response);
		
		String lastname = js.get("data.last_name");
		
		System.out.println(lastname);
	}
}
