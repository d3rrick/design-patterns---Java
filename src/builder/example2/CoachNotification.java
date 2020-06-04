package builder.example2;

public class CoachNotification implements PersonalNotification{
    @Override
    public void sendNotification(Booking booking) {
        System.out.println("coach");
        System.out.println("send sms and email");

    }
}
