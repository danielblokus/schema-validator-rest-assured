package io.github.danielblokus;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.fail;

public class SchemaValidatorTest {

    private final static String ANYTHING_URL = "https://httpbin.org/anything";

    @Test
    public void firstTest() {
        fail("FAIL");
    }

    @Test
    public void secondTest() {
        given()
        .when()
            .get(ANYTHING_URL)
        .then()
            .assertThat()
                .statusCode(200);
    }
}
