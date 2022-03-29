package NewsApi_2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class USData {
    @Test
    public void jsonAryValue() {

        //base URI with Rest Assured class
        RestAssured.baseURI = "https://newsapi.org/v2";

        //obtain Response from GET request
        Response res = given()
                .when()
                .get("/everything?q=apple&from=2022-03-12&to=2022-03-12&sortBy=popularity&apiKey=93ed7aed56424817a0868e9d6649befd");
        System.out.println(res.prettyPrint());












        //convert JSON to string
//        JsonPath j = new JsonPath(res.asString());
//
//        Zip for 2nd Location array
//        String name = j.getString("articles.source[1].name");
//          String author = j.getString("articles.source.author[1]");
//
//          System.out.println("Zip for 2nd Location array: " + author);
//        System.out.println("Zip for 2nd Location array: " + author);
//        j.getString("articles.source[1].id");
//
//          Assert.assertTrue(author.equalsIgnoreCase("engadget"));

    }
}