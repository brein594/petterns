package structurnie.observer;

public interface Observable {

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyAllSubscribers();
}
