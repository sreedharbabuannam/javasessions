package practice;

import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import files.ReUsableMethods;



public class basics5 {
	
	@Test
	public void test() {
	

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BaseURL or Host
		RestAssured.baseURI ="https://maps.googleapis.com";
		
		Response res=given().
	       param("location","-33.8670522,151.1957362").
	       param("radius","500").
	       param("key","AIzaSyBct9qPgUaVzD3fRZ9IVu9Y0ipFKg5JuMg").
	       when().
	       get("/maps/api/place/nearbysearch/json").
	       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
	       body("results[0].name",equalTo("Sydney")).extract().response();
	//here in json reponse we have results object and which have 20 arrays each one contains a name, that all we have to print by traversing
		
		JsonPath js= ReUsableMethods.rawToJson(res);
		int count = js.getInt("results.size()");
		System.out.println(count);   //20
		for(int i=0;i<count;i++) {
			
		String allnames=js.get("results["+i+"].name");
		System.out.println(allnames);
		}
	}}
	//output will be as below
		//20
		//Sydney
		//The Star Grand Residences (formerly Astral Residences)
		//The Little Snail Restaurant
		//Lobby Lounge
		//Sydney Darling Harbour Hotel
		//Flying Fish
		//Google Australia
		//Jones Bay Wharf
		//Doltone House
		//Blue Eye Dragon
		//Australian National Maritime Museum
		//Fawlty Towers Hotel
		//Sydney Lyric Theatre
		//Doltone House - Darling Island
		//Cafe Morso
		//3 Bed House Pyrmont 15m
		//InterPark Australia Pty Ltd
		//Pyrmont Bridge Hotel
		//Star Cosmetic Medicine
		//Sydney
		//PASSED: test
		//===============================================
	    //Default test
	    //Tests run: 1, Failures: 0, Skips: 0
	//===============================================

	       
				
				


