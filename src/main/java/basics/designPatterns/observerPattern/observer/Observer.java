package basics.designPatterns.observerPattern.observer;

import basics.designPatterns.observerPattern.observable.Observable;

public interface Observer {
    void update(Observable o, Object arg);
}
