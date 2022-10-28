package Helper;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Credentials;

import static io.restassured.RestAssured.given;

public class Token {

    public static String get(String username, String password) {
        var body = new Credentials(username, password);
        Response response = given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/me")
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath json = response.jsonPath();
        return json.getString("token");
    }
}
