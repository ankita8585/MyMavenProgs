package RestAssured;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class DeleteRequest {
	
	@Test
	public void deleteId() {
		
		given().
			baseUri("https://thetestingworldapi.com").
		when().
			delete("/api/studentsDetails/1137287").	
		then().
			assertThat().
			statusCode(200).
			log().all();
			
			
	}

}
