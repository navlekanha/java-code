package FuctionalTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestAutomation {
	@Test
	public void getRequest()
	{
		RestAssured.baseURI="https://reqres.in/api/users/2";
		Response res = RestAssured.given().param("").when().get();
		System.out.println("status code: "+res.getStatusCode());
		System.out.println("cookies of API: "+res.getCookies());
		System.out.println("time: "+res.getTime());
		System.out.println(res.prettyPrint());
		//System.out.println(res.getBody().asString());
		  
	}

}
