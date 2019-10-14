package practice;

import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import files.ReUsableMethods;



public class basics5Logimplementation {
	
	@Test
	public void test() {
	

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BaseURL or Host
		RestAssured.baseURI ="https://maps.googleapis.com";
		/*
		 * when you want to give log for request you to write under given when you want
		 * to give log for response you to write under then
		 * logs will print all details abot what we are using which help us to find if anything fails easily
		 */
		Response res=given().
	       param("location","-33.8670522,151.1957362").
	       param("radius","500").
	       param("key","AIzaSyBct9qPgUaVzD3fRZ9IVu9Y0ipFKg5JuMg").log().all().
	       when().
	       get("/maps/api/place/nearbysearch/json").
	       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
	       body("results[0].name",equalTo("Sydney")).log().body().
	       extract().response();
	//here in json reponse we have results object and which have 20 arrays each one contains a name, that all we have to print by traversing
		
		JsonPath js= ReUsableMethods.rawToJson(res);
		int count = js.getInt("results.size()");
		System.out.println(count);   //20
		for(int i=0;i<count;i++) {
			
		String allnames=js.get("results["+i+"].name");
		System.out.println(allnames);
		}
	}}
	
				
				


