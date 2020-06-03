package builderpatters.example2;

public class ManagerNotification implements PersonalNotification{
    @Override
    public void sendNotification(Booking booking) {
        System.out.println("manager");
        System.out.println("email");
    }
}
