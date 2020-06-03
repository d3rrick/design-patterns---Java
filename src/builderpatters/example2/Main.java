package builderpatters.example2;

public class Main {
    public static void main(String[] args) {
            /*
            complexity is abstracted from the client code.

            NotificationBuilder does all complexity

            Notification Class is composed of other objects -> stored in a list.
            and the whole logic is abstracted in the Builder

            In case of business changes then there will be a clear way of changing the rules

             */


//        create a booking object
        Booking b = new Booking();
        b.setBookingType(BookingType.LIFETIME);

//        create a notification builder
        NotificationBuilder builder = new NotificationBuilder(b);

//        decision will be determined from the type of booking
        Notification notification = builder.buildNotification();

//        notification will be sent to the target persons
        notification.notifyNow();


    }
}
