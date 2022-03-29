package NewsApi_2;


import com.fasterxml.jackson.databind.util.JSONPObject;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import jdk.nashorn.internal.parser.JSONParser;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;


public class TeslaData {

    @Test
    public void Tesla(){
        RestAssured.baseURI= "https://newsapi.org/v2";
        //RestAssured.defaultParser=  Parser.JSON;

        Response res = given()
                       .when()
                            .get("/everything?q=tesla&from=2022-02-14&sortBy=publishedAt&apiKey=93ed7aed56424817a0868e9d6649befd");

        //String name = j.getJsonObject("articles.source.name[0]");
        List<String> author = res.jsonPath().getJsonObject("articles.author");
        System.out.println(author);
        //int[] id = j.getJsonObject("articles.source.id[]");

        //System.out.println(id[0]);
        /*Assert.assertEquals(id.length(), "9");


        Assert.assertEquals(res.statusCode(), 200);
        System.out.println(res.getHeaders());*/


    }
}