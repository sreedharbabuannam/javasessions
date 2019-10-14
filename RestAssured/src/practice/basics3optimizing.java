package practice;

import static io.restassured.RestAssured.given;
import files.resources;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import files.payLoad;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class basics3optimizing {
	
	Properties prop=new Properties();
	@BeforeTest
	public void getData() throws IOException
	{
		
		FileInputStream fis=new FileInputStream("E:\\Softwares\\Webservices\\Rest\\Workspace\\RestAssured\\src\\files\\env.properties");
		prop.load(fis);
		
		//prop.getproperty("HOST");
	}
	@Test
	public void AddandDeletePlace() {
	
		//Task1 : Grab the response
		RestAssured.baseURI=prop.getProperty("HOST");
		
		Response res =given().
		//queryParam("key","AIzaSyBct9qPgUaVzD3fRZ9IVu9Y0ipFKg5JuMg").
		queryParam("key",prop.getProperty("KEY")).
		body(payLoad.getPostData()).
		when().
		post(resources.placePostData()).
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("status",equalTo("OK")).and().extract().response();
		
		
		
		//Task 2: Grab the place id from response
		
		/* Here we are converting response From Raw to String and string to json */
		String responsestring = res.asString();
		System.out.println(responsestring);
		JsonPath js = new JsonPath(responsestring);
		String Placeid = js.get("place_id");
		System.out.println("place id from response is:"+Placeid);
		
		
		
		//Task 3: Place this place id in delete request
		
		
		given().
				
				queryParam("key","qaclick123").
				body("{"+
						  "\"place_id\": \""+Placeid+"\""+
						"}").
								when().
								post("/maps/api/place/delete/json").
								then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
								body("status",equalTo("OK"));
								
		
		
		
		
		
		

}}



