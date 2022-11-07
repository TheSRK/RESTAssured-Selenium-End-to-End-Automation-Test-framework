package API_Automation.API_Commons;

import Utils.PropertiesManager;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public interface APIConstants {

    LocalDate futureDate = LocalDate.now().plusMonths(2);
    LocalDate currentDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    String futureCheckoutDate = futureDate.format(formatter);
    String currentCheckInDate = currentDate.format(formatter);


    //initialize properties manager class with api_confiq file
    PropertiesManager prop = new PropertiesManager("./src/test/resources/api_config.properties");

    String BASE_URL = prop.getProperty("baseUrl");
    String CREATE_BOOKING_ENDPOINT = prop.getProperty("createBookingEndpoint");


    String firstname = "firstname";
    String lastname = "lastname";
    String totalprice = "totalprice";
    String depositpaid = "depositpaid";
    String bookingdates = "bookingdates";
    String checkin = "checkin";
    String checkout = "checkout";
    String additionalneeds = "additionalneeds";
}
