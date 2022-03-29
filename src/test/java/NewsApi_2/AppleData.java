package NewsApi_2;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import javafx.scene.layout.Priority;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.Locale;

import static io.restassured.RestAssured.given;

public class AppleData {

    @Test
    public void Apple() {
        //base URI with Rest Assured class
        RestAssured.baseURI = "https://newsapi.org/v2";

        //obtain Response from GET request
        Response res
                = given().
                  header("Content-Type", "application/json").header("accept","ContentType.json")
                  .when()
                  .get("/everything?q=apple&from=2022-03-13&to=2022-03-13&sortBy=popularity&apiKey=93ed7aed56424817a0868e9d6649befd");


                Assert.assertEquals(res.statusCode(),200);
                Assert.assertEquals(res.contentType(),"application/json; charset=utf-8");
                Assert.assertEquals(res.getTime(),"application/json; charset=utf-8");
                //Assert.assertEquals(res.(),"application/json; charset=utf-8");

                //System.out.println(res.getBody().prettyPrint());
                System.out.println(res.getHeaders());

//                System.out.println(res.getStatusCode());
//                System.out.println(res.getContentType());

                //Response Particular Assert
                /*JsonPath j = new JsonPath(res.asString());
                String name = j.getJsonObject("articles.source.name[0]");
                String id = j.getJsonObject("articles.source.id[0]");

                Assert.assertEquals(id, "the-verge");
                Assert.assertEquals(id.toLowerCase(), "the-verge");
                Assert.assertEquals(name.toUpperCase(Locale.ROOT), "CNET");
                Assert.assertEquals(name.toString(),"The Verge");
                Assert.assertEquals(name.equals("The Verge"), "true");
                Assert.assertEquals(id.toUpperCase(Locale.ROOT), "THE-VERGE");
                Assert.assertEquals(id.toUpperCase(Locale.ROOT), "THE-VERGE");*/





                /*System.out.println("The Status Code: " +res.getStatusCode());
                System.out.println("id for array: " +id);*/
    }
}

