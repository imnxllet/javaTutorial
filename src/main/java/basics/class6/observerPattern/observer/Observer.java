package basics.class6.observerPattern.observer;

import basics.class6.observerPattern.publisher.Publisher;

public abstract class Observer {
    protected Publisher publisher;
    public abstract void update();
}
