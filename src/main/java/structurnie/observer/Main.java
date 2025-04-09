package structurnie.observer;

public class Main {
    public static void main(String[] args) {
        var obs1 = new Samplebserver();
        var obs2 = new Samplebserver();
        var obs3 = new Samplebserver();

        var publisher = new SamplePublisher();

        publisher.subscribe(obs1);
        publisher.subscribe(obs2);
        publisher.subscribe(obs3);
        System.out.println("1 group");
        publisher.notifyAllSubscribers();
        publisher.unsubscribe(obs3);
        System.out.println("2 group");
        publisher.notifyAllSubscribers();
        publisher.unsubscribe(obs2);
        System.out.println("3 group");
        publisher.notifyAllSubscribers();
    }
}
