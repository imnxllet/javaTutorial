package finalReview.observer.dec2018Q1;

import java.util.HashSet;
import java.util.Set;

public class Observable {
    private Set<Observer> observers = new HashSet<>();

    /**
     * adds o to the set of observers if it isn't already there
     *
     * @param o
     */
    void addObserver(Observer o) {
        observers.add(o);
    }

    /**
     * if this object has changed, as indicated by
     * the hasChanged method, then notifies all of its observers by calling update (arg)
     * and then calls the clearChanged method to indicate that this object has no longer changed
     */
    public void notifyObservers(Object arg) {
        for (Observer o : observers)
            o.update(this, arg);
    }
}
