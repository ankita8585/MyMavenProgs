package RestAssured;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetRequest {
	
	@Test
	public void getAll() {
		
		//given(). Pass Information - URL, header
		//when(). Give API method, endpoints
		//then(). expect response, log, assertion
		
		given().
			baseUri("http://thetestingworldapi.com").
		when().
			get("/api/studentsDetails").
		then().
			assertThat().
			statusCode(200).
			log().all();

}

	
}
