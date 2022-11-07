package API_Automation.Requests;

import API_Automation.API_Commons.APIConstants;
import API_Automation.API_Commons.SpecificationSetup;
import API_Automation.Data.BookingData;
import API_Automation.Data.SerializeBookingData;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreateBooking {

//    JSONObject jsonObject = new JSONObject(getPayload());

    public BookingData getPayload() {
        serializeBookingData.setBookingData(new BookingData());
        return serializeBookingData.getBookingData();
    }

    SerializeBookingData serializeBookingData = new SerializeBookingData();


    public void postCreateBookingEndpoint(){
        RestAssured.baseURI = APIConstants.BASE_URL;
        Response response =
                given()
                        .contentType("application/json")
                        .accept("application/json")
                        .body(getPayload())
                .when()
                        .post(APIConstants.CREATE_BOOKING_ENDPOINT)
                .then()
                        .log()
                        .all()
                        .spec(SpecificationSetup.setResponseSpecification())
                        .statusCode(200)
                        .extract().response();


    }
}
