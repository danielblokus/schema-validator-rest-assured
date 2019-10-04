package io.github.danielblokus;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.junit.Assert.fail;

public class SchemaValidatorTest {

    private final static String ANYTHING_URL = "https://httpbin.org/anything";
    private final static String UUID_URL = "https://httpbin.org/uuid";

    private final static String UUID_SCHEMA_FILE = "response.json";

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

    @Test
    public void givenUrl_whenJsonResponseConformsToSchema_thenCorrect() {
        given()
        .when()
            .get(UUID_URL)
        .then()
            .assertThat()
                .body(matchesJsonSchemaInClasspath(UUID_SCHEMA_FILE));
    }
}
