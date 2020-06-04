package observer.example1;

import java.util.ArrayList;
import java.util.List;

public class Observable implements ObservableInterface {

    //i need a list of all observers
    List<ObserverInterface> observerList = new ArrayList<ObserverInterface>();

    @Override
    public void add(ObserverInterface observer) {
        //when called append observers to a list
        this.observerList.add(observer);

    }

    @Override
    public void remove(ObserverInterface observer) {
        //deleting observers from list
        this.observerList.remove(observer);
    }

    @Override
    public void sendNotification() {
        System.out.println("send: hey devices, temperature has changed...");
        observerList.stream()
                .forEach(observer-> observer.getUpdates());
    }

    public void getTemperature(){
        //use this method after notification to access
        System.out.println("temperature is 20 degrees");

    }
}
