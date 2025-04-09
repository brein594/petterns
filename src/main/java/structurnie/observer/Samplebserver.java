package structurnie.observer;

public class Samplebserver implements Observer {
    @Override
    public void handleEvent() {
        System.out.println("event happened");
    }
}
