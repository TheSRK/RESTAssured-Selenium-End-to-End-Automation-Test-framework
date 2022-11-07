package API_Automation.API_Tests;

import API_Automation.Requests.CreateBooking;
import org.testng.annotations.Test;

public class CreateBookingTests {
    CreateBooking createBooking = new CreateBooking();

    @Test
    public void testPostCreateBooking(){
        createBooking.postCreateBookingEndpoint();
    }

}
