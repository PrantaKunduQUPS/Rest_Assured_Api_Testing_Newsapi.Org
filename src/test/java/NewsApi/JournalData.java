package NewsApi;

import Base.Base;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class JournalData extends Base {
    @Test
    public void Apple(){


        given()
                .when()
                .get()
                .then()

                .log()
                .all();
    }
}
