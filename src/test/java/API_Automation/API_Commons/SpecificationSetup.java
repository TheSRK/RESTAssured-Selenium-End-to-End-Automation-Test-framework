package API_Automation.API_Commons;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;

public class SpecificationSetup {

    public static RequestSpecification setRequestSpecification(){
        return given()
                .baseUri("https://restful-booker.herokuapp.com/booking")
                .contentType("application/json");
    }

    public static ResponseSpecification setResponseSpecification(){
        return expect()
                .statusCode(200)
                .contentType("application/json");
    }
}
