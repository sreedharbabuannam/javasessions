package practice;
import org.testng.annotations.Test;

import files.ReUsableMethods;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class basics4 {
	
	@Test
	public void createPlaceAPI() throws IOException
	{
		String Postdata= GenerateStringFromResource("E:\\Softwares\\Webservices\\Rest\\inputdocs\\postdata.xml");
		//RestAssured.baseURI="https://maps.googleapis.com";
		RestAssured.baseURI="http://216.10.245.166";
		
		Response res =given().
		//queryParam("key","AIzaSyBct9qPgUaVzD3fRZ9IVu9Y0ipFKg5JuMg").
		queryParam("key","qaclick123").
		
		
		body(Postdata).
		when().
		post("/maps/api/place/add/xml").
		then().assertThat().statusCode(200).and().contentType(ContentType.XML).extract().response();
		String responsemsg = res.asString();
		System.out.println(responsemsg);
		
		//out put will be in xml format as below
		/*
		 * <?xml version="1.0"?>
		 * <response><status>OK</status><place_id>f22fb616942973c8c1bf6f7938c829f2</
		 * place_id><scope>APP</scope><reference>
		 * 746ad9ee7829fbb2801dcdf9a0da3b2d746ad9ee7829fbb2801dcdf9a0da3b2d</reference><
		 * id>746ad9ee7829fbb2801dcdf9a0da3b2d</id></response>
		 */

		
		XmlPath x=new XmlPath(responsemsg);
		
		//XmlPath x=ReUsableMethods.rawToXML(res);
		
	//	System.out.println(x.get(response.place_id));
		
		
		
	

	}


public static String GenerateStringFromResource(String path) throws IOException {
	
	return new String(Files.readAllBytes(Paths.get(path)));
	
}}

