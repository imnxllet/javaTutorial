package basics.designPatterns.observerPattern.observable;

import basics.designPatterns.observerPattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Number implements Observable{

    private List<Observer> observers = new ArrayList<Observer>();
    private int number;

    @Override
    public void update(Object arg) {
        this.number = (int) arg;
        notifyObservers(number);
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void notifyObservers(Object arg) {
        for (Observer observer : observers) {
            observer.update(this, arg);
        }
    }
}
