package FuctionalTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Auth {

	@Test
	public void testAuth()
	{
	   RestAssured.baseURI="https://reqres.in/api";
	   /*RestAssured.given().param("").
       when().get("/users/2")
       .then().statusCode(300).log().all();*/
	   Response res = RestAssured.given().when().get("/users/2");
	   System.out.println(res.statusCode());
	   System.out.println(res.getBody().prettyPrint());
	   System.out.println(res.getContentType());
	   System.out.println("time is "+res.getTime());
	   String str="";
	   System.out.println("cookies are "+res.getCookie(str));
	   
	   Assert.assertEquals(res.statusCode(), 200);
	   Assert.assertEquals(res.contentType(), "application/json");
	   
		
	}
}
