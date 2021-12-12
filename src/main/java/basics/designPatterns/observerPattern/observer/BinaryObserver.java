package basics.designPatterns.observerPattern.observer;

import basics.designPatterns.observerPattern.publisher.Publisher;

public class BinaryObserver extends Observer {

    public BinaryObserver(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String is updated to " + Integer.toBinaryString(publisher.getNumber()));
    }
}
