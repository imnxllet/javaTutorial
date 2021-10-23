package basics.class6.observerPattern;

import basics.class6.observerPattern.observer.BinaryObserver;
import basics.class6.observerPattern.observer.OctalObserver;
import basics.class6.observerPattern.publisher.Publisher;

public class Demo {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        new OctalObserver(publisher);
        new BinaryObserver(publisher);

        System.out.println("Publisher: 'number change to 15'");
        publisher.updateNumber(15);

        System.out.println("\nPublisher: 'number change to 10'");
        publisher.updateNumber(10);
    }
}
