package basics.designPatterns.observerPattern.observer;

import basics.designPatterns.observerPattern.publisher.Publisher;

public class OctalObserver extends Observer {

    public OctalObserver(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String is updated to " + Integer.toOctalString(publisher.getNumber()));
    }
}
