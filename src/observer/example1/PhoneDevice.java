package observer.example1;

public class PhoneDevice implements ObserverInterface {
    public Observable observable;

    public PhoneDevice(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void getUpdates() {
        System.out.println("getting updates from phone device");
        // the device can now fetch data from the weather station
        // but the initiator of the action is the weather station

        this.observable.getTemperature();
    }

}
