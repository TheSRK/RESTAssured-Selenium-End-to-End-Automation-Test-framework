package API_Automation.Requests;

import API_Automation.API_Commons.APIConstants;
import API_Automation.API_Commons.SpecificationSetup;
import API_Automation.Data.BookingData;
import API_Automation.Data.SerializeBookingData;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CreateBooking {

    public BookingData getPayload() {
        serializeBookingData.setBookingData(new BookingData());
        return serializeBookingData.getBookingData();
    }

    SerializeBookingData serializeBookingData = new SerializeBookingData();


    public void postCreateBookingEndpoint(){
        //RestAssured.baseURI = APIConstants.BASE_URL;
        Response response =
                SpecificationSetup
                        .setRequestSpecification()
                        .body(getPayload())
                .when()
                        .post(APIConstants.CREATE_BOOKING_ENDPOINT)
                .then()
                        .spec(SpecificationSetup.setResponseSpecification()) //verify status code and content-type
                        .log()
                        .all()
                        .assertThat()
                        //response schema validation
                        .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("JSONSchema/createBookingResponse.json"))
                        .extract().response();

        JsonPath jsonPath = response.jsonPath();
        //retrieve bookingid from the response
        int bookingid= jsonPath.get("bookingid");
        //verify bookingid is valid
        assertThat(bookingid,greaterThan(0));


    }
}
