package observer.example1;

public class WindowsDisplay implements ObserverInterface {
    public Observable observable;

    public WindowsDisplay(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void getUpdates() {
        System.out.println("getting updates from windows device");

        // the device can now fetch data from the weather station
        // but the initiator of the action is the weather station
        this.observable.getTemperature();
    }

}
