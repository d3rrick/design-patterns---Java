package builderpatters.example2;

public class MemberNotification implements PersonalNotification {

    @Override
    public void sendNotification(Booking booking) {
        System.out.println("member");
        System.out.println("send sms and email");
    }
}

