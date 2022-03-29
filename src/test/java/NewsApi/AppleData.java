package NewsApi;
import com.fasterxml.jackson.databind.util.JSONPObject;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AppleData {

    @Test
    public void Apple() {
        //base URI with Rest Assured class
        RestAssured.baseURI = "https://newsapi.org/v2";

        //obtain Response from GET request
        Response res
                = given()
                .when()
                .get("/everything?q=apple&from=2022-03-13&to=2022-03-13&sortBy=popularity&apiKey=93ed7aed56424817a0868e9d6649befd");


        //System.out.println(res.prettyPrint());


        //convert JSON to string
        JsonPath j = new JsonPath(res.asString());

        //System.out.println(j.prettyPrint());
        String id = j.getJsonObject("articles[1].id");
        System.out.println("id for array: " +id);
        //Assert.assertEquals(id, "bbc-news");

        /*Assert.assert*/
        //System.out.println("id for API: " +id);
        /*String author = j.getString("articles.author[2]");
        if (id.equalsIgnoreCase("wired")) {
            System.out.println("True");
        }
            else {
            System.out.println("False");
            }
        System.out.println("id for array: " +id);
        System.out.println("id for array: " +author);
        }

        //Assert.assertTrue(id.equalsIgnoreCase("engadget2"));
    }
}


         */
    }}