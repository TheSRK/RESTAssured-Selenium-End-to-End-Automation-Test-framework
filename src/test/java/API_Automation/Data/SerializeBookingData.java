package API_Automation.Data;

public class SerializeBookingData {
    public BookingData getBookingData() {
        return bookingData;
    }

    public void setBookingData(BookingData bookingData) {
        bookingData.setFirstname("shoeib");
        bookingData.setLastname("shargo");
        bookingData.setTotalprice(100);
        bookingData.setDepositpaid(true);
        bookingData.setDepositpaid(true);

        BookingDates bookingDates = new BookingDates();
        bookingDates.setCheckin("2022-01-01");
        bookingDates.setCheckout("2023-01-01");

        bookingData.setBookingdates(bookingDates);
        bookingData.setAdditionalneeds("golf");
        this.bookingData = bookingData;
    }

    BookingData bookingData = new BookingData();


}
