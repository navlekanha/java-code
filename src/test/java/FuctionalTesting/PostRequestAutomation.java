package FuctionalTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequestAutomation {
	@Test
	public void postRequest()
	{
		RestAssured.baseURI="https://reqres.in/api/users";
		String str="{\r\n"
				+ "    \"name\": \"Kanha\",\r\n"
				+ "    \"job\": \"IT\"\r\n"
				+ "}";
		//RestAssured.given().body(str).when().post().then().assertThat().log().all().statusCode(201);
		Response resp = RestAssured.given().body(str).when().post();
		System.out.println("status code"+resp.getStatusCode());
		System.out.println("time"+resp.getTime());
		System.out.println(resp.prettyPrint());
		
	}

}
