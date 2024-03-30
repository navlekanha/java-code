package FuctionalTesting;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetClass {
	
	@BeforeClass
	public void setup()
	{
		RestAssured.baseURI="https://petstore.swagger.io";
	}
	
	@Test
	public void testGet()
	{
	
		 Response response = RestAssured.given().header("accept", "application/json").
				   when().get("/v2/pet/findByStatus?status=available");
		   
		   System.out.println(response.prettyPrint());
		   System.out.println(response.getStatusCode());
		   Assert.assertEquals(response.statusCode(),200);
		   Assert.assertEquals(response.contentType(), "application/json");
	}
    @Test
    public void postPets()
    {
    	String json="{\r\n"
    			+ "  \"id\": 9223372036854315000,\r\n"
    			+ "  \"category\": {\r\n"
    			+ "    \"id\": 0,\r\n"
    			+ "    \"name\": \"string\"\r\n"
    			+ "  },\r\n"
    			+ "  \"name\": \"doggie\",\r\n"
    			+ "  \"photoUrls\": [\r\n"
    			+ "    \"string\"\r\n"
    			+ "  ],\r\n"
    			+ "  \"tags\": [\r\n"
    			+ "    {\r\n"
    			+ "      \"id\": 0,\r\n"
    			+ "      \"name\": \"string\"\r\n"
    			+ "    }\r\n"
    			+ "  ],\r\n"
    			+ "  \"status\": \"available\"\r\n"
    			+ "}";
    	Response res=RestAssured.given().header("accept","application/json").header("Content-Type","application/json").
    			   body(json).
    			    when().post("/v2/pet");
    	System.out.println(res.asPrettyString());
    	Assert.assertEquals(res.statusCode(), 200);
    	Assert.assertEquals(res.contentType(), "application/json");
    }
    @Test
    public void putPets()
    {
    	String json="{\r\n"
    			+ "  \"id\": 9223372036854315000,\r\n"
    			+ "  \"category\": {\r\n"
    			+ "    \"id\": 0,\r\n"
    			+ "    \"name\": \"string\"\r\n"
    			+ "  },\r\n"
    			+ "  \"name\": \"doggie123\",\r\n"
    			+ "  \"photoUrls\": [\r\n"
    			+ "    \"string\"\r\n"
    			+ "  ],\r\n"
    			+ "  \"tags\": [\r\n"
    			+ "    {\r\n"
    			+ "      \"id\": 0,\r\n"
    			+ "      \"name\": \"string\"\r\n"
    			+ "    }\r\n"
    			+ "  ],\r\n"
    			+ "  \"status\": \"available\"\r\n"
    			+ "}";
    	Response res=RestAssured.given().header("accept","application/json").header("Content-Type","application/json").
    			   body(json).
    			    when().put("/v2/pet");
    	System.out.println(res.asPrettyString());
    	Assert.assertEquals(res.statusCode(), 200);
    	Assert.assertEquals(res.contentType(), "application/json");
    }
    
    @Test
    public void delete()
    {
    	     Response response = RestAssured.given().header("accept"," application/json")
    	    		            .when().delete("/v2/pet/121");
    	     System.out.println(response.prettyPrint());
    }
    
    
    
    
    
    
}
