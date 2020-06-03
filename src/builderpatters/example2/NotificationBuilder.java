package builderpatters.example2;

public class NotificationBuilder {

    private Booking booking;

    public NotificationBuilder(Booking booking) {
        this.booking = booking;
    }

    public Notification buildNotification(){
        switch (this.booking.bookingType.toString()){
            case "INDIVIDUAL":
                return individualBooking(this.booking);
            case "COACHING":
                return coachingBooking(this.booking);
            case  "LIFETIME":
                return lifetimeBooking(this.booking);
            default:
                return null;
        }
        //can be substituted with if statements

//        if(b.bookingType.toString().equals("INDIVIDUAL")){
//            return individualBooking(b);
//        }else if(b.bookingType.toString().equals("COACHING")){
//            return coachingBooking(b);
//        }else if(b.bookingType.toString().equals("LIFETIME")){
//            return lifetimeBooking(b);
//        }
//        else{
//            return null;
//        }
    }


    public Notification individualBooking(Booking b){
        Notification n = new Notification();
        n.stakeholders.add(new SecurityNotification());
        n.stakeholders.add(new MemberNotification());
        return n;
    }

    public Notification coachingBooking(Booking b){
        Notification n = new Notification();
        n.stakeholders.add(new SecurityNotification());
        n.stakeholders.add(new MemberNotification());
        n.stakeholders.add(new CoachNotification());
        return n;
    }

    public Notification lifetimeBooking(Booking b){
        Notification n = new Notification();
        n.stakeholders.add(new SecurityNotification());
        n.stakeholders.add(new MemberNotification());
        n.stakeholders.add(new CoachNotification());
        n.stakeholders.add(new ManagerNotification());
        return n;
    }
}
