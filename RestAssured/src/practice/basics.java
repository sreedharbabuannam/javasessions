package practice;

import io.restassured.RestAssured;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;



public class basics {
	
	@Test
	public void test() {
	

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BaseURL or Host
		RestAssured.baseURI ="https://maps.googleapis.com";
		
		given().
	       param("location","-33.8670522,151.1957362").
	       param("radius","500").
	       param("key","AIzaSyBct9qPgUaVzD3fRZ9IVu9Y0ipFKg5JuMg").
	       when().
	       get("/maps/api/place/nearbysearch/json").
	       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
	       body("results[0].name",equalTo("Sydney"));
	       
				
				

	}

}
