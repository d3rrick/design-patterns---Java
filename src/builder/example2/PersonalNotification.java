package builder.example2;

public interface PersonalNotification {
    //the interface takes in a booking object because there is a need to know the details of the booking
    //maybe to add to sms or email body
    public void sendNotification(Booking booking);
}
