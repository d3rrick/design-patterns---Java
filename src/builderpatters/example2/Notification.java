package builderpatters.example2;

import java.util.ArrayList;
import java.util.List;

public class Notification {
    public Booking booking;
    List<PersonalNotification> stakeholders = new ArrayList<PersonalNotification>();

    public void notifyNow(){
        stakeholders.stream()
                .forEach(m-> m.sendNotification(booking));
    }
}
