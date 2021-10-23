package basics.class6.observerPattern.observer;

import basics.class6.observerPattern.publisher.Publisher;

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
