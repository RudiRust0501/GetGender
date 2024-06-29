package RestAssure_Testing.RestAssure_Flip;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

@Test
public class GetApiTest {

	public static void GetDataGender() {

		given()
				// Specifying the Base URI.
				.baseUri("https://api.genderize.io?name=Isabella").contentType(ContentType.JSON).when()
				// HTTP Request Method.
				.get("/name/Isabella").then()
				// Ensuring that status code is 200 OK.
				.statusCode(200)
				// validating count
				.body("data.count", equalTo(91490))
				// Validating Name value.
				.body("data.name", equalTo("Isabella"))
				// Validating Gender value.
				.body("data.gender", equalTo("female"))
				// Ensuring that probability value is not null.
				.body("data.probability", notNullValue())
				// Log response details
				.log().all();

		given().baseUri("https://api.genderize.io?name=Olivia").contentType(ContentType.JSON).when().get("/name/Olivia")
				.then().statusCode(200).body("data.count", equalTo(167968)).body("data.name", equalTo("Olivia"))
				.body("data.gender", equalTo("female")).body("data.probability", notNullValue()).log().all();

		given().baseUri("https://api.genderize.io?name=Ethan").contentType(ContentType.JSON).when().get("/name/Ethan")
				.then().statusCode(200).body("data.count", equalTo(62728)).body("data.name", equalTo("Ethan"))
				.body("data.gender", equalTo("male")).body("data.probability", notNullValue()).log().all();

		given().baseUri("https://api.genderize.io?name=Christopher").contentType(ContentType.JSON).when()
				.get("/name/Christopher").then().statusCode(200).body("data.count", equalTo(567158))
				.body("data.name", equalTo("Christopher")).body("data.gender", equalTo("male"))
				.body("data.probability", notNullValue()).log().all();

		given().baseUri("https://api.genderize.io?name=Sophia").contentType(ContentType.JSON).when().get("/name/Sophia")
				.then().statusCode(200).body("data.count", equalTo(104370)).body("data.name", equalTo("Sophia"))
				.body("data.gender", equalTo("female")).body("data.probability", notNullValue()).log().all();

	}
}
