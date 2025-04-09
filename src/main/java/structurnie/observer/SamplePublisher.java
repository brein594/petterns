package structurnie.observer;

import java.util.ArrayList;
import java.util.List;


public class SamplePublisher implements Observable {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllSubscribers() {
        observers.forEach(Observer::handleEvent);
    }
}
