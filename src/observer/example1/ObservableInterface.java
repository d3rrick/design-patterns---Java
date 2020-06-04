package observer.example1;

public interface ObservableInterface {
    public void add(ObserverInterface observer);
    public void remove(ObserverInterface observer);
    public void sendNotification();
}
