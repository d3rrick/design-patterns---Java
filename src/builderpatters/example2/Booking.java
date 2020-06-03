package builderpatters.example2;

enum BookingType{
    INDIVIDUAL,COACHING,LIFETIME
}

public class Booking {
    public BookingType bookingType;

    public BookingType getBookingType() {
        return bookingType;
    }

    public void setBookingType(BookingType bookingType) {
        this.bookingType = bookingType;
    }
}
