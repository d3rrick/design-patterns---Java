package builder.example2;

public class SecurityNotification implements PersonalNotification{

    @Override
    public void sendNotification(Booking booking) {
        System.out.println("security");
        System.out.println("send sms..");
    }
}
