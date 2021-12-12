package basics.designPatterns.observerPattern.observer;

import basics.designPatterns.observerPattern.publisher.Publisher;

public abstract class Observer {
    protected Publisher publisher;
    public abstract void update();
}
