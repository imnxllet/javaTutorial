package basics.designPatterns.observerPattern.observable;

import basics.designPatterns.observerPattern.observer.Observer;

public abstract class Observable {

    /**
     * adds o to the set of observers if it isn't already there
     *
     * @param o
     */
    abstract void addObserver(Observer o);

    /**
     * if this object has changed, as indicated by
     * the hasChanged method, then notifies all of its observers by calling update (arg)
     * and then calls the clearChanged method to indicate that this object has no longer changed
     */
    abstract void notifyObservers(Object arg);

    abstract void update(Object arg);
}