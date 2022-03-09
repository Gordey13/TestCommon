package tests_github;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class RestTest {

    @Test
    public void getUsers(){
        given()
                .baseUri("https://google.com")
                .basePath("/gmail")
                .contentType(ContentType.JSON)
                .when().get()
                .then().statusCode(200)
                .extract().jsonPath().getList("data.email");
    }
}
