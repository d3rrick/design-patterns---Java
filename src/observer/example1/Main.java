package observer.example1;

public class Main {
    public static void main(String[] args) {

        //the weather station is the one that begins the action of notification
        //instantiate weather station object that is an observable implementing the observable interface
        Observable weatherStation = new Observable();

        //the the weather station wants to notify a sensor display

        //create the observers
        // pass the weather station reference to the observers
        // the observer can also look into the weather station
        // because when it receives notification that weather has changed, then it needs to access that data

        //create two observers - implementing observer interface
        PhoneDevice phone = new PhoneDevice(weatherStation);
        WindowsDisplay windows = new WindowsDisplay(weatherStation);

        //register the observers
        weatherStation.add(phone);
        weatherStation.add(windows);

        // do notification
        weatherStation.sendNotification();


    }
}
