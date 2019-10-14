package practice;

import static io.restassured.RestAssured.given;
//import practice.resources;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
//import TestFramework.payLoad;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class basics3 {
	
	@Test
	public void AddandDeletePlace()
	{
		
		String b= "{"+
				  "\"location\": {"+
				    "\"lat\": -33.8669710,"+
				    "\"lng\": 151.1958750"+
				  "},"+
				  "\"accuracy\": 50,"+
				  "\"name\": \"Google Shoes!\","+
				  "\"phone_number\": \"(02) 9374 4000\","+
				  "\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","+
				  "\"types\": [\"shoe_store\"],"+
				  "\"website\": \"http://www.google.com.au/\","+
				  "\"language\": \"en-AU\""+
				"}";
		//Task1 : Grab the response
		RestAssured.baseURI="http://216.10.245.166";
		
		Response res =given().
		//queryParam("key","AIzaSyBct9qPgUaVzD3fRZ9IVu9Y0ipFKg5JuMg").
		queryParam("key","qaclick123").
		body(b).
		when().
		post("/maps/api/place/add/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("status",equalTo("OK")).and().extract().response();
		
		/*
		 * output of raw is below:
		 * {"status":"OK","place_id":"be1577c033a8ac86bd0eebb153c9dc17","scope":"APP",
		 * "reference":
		 * "5c32f2055c351b21ad1a9b0077d6da845c32f2055c351b21ad1a9b0077d6da84","id":
		 * "5c32f2055c351b21ad1a9b0077d6da84"} When you extract response you will get as
		 * raw format, so you have to convert raw format into string and from string to
		 * json we have to convert using jsonpath
		 */	
		
		//Task 2: Grab the place id from response
		
		/* Here we are converting response From Raw to String and string to json */
		String responsestring = res.asString();
		System.out.println(responsestring);
		JsonPath js = new JsonPath(responsestring);
		String Placeid = js.get("place_id");
		System.out.println("place id from response is:"+Placeid);
		
		/*
		 * output of place id below place id from response
		 * is:dcb812eea4038607ab0da930b738b5e1
		 */
		
		//Task 3: Place this place id in delete request
		
		/*
		 * Here we are passing the place id to delete. delete also comes under post
		 * request , so we have to pass data as body/payload format only.
		 */
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
