package basics.designPatterns.observerPattern.publisher;

import basics.designPatterns.observerPattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private List<Observer> observers = new ArrayList<Observer>();
    private int number;

    public int getNumber() {
        return number;
    }

    public void updateNumber(int state) {
        this.number = state;
        notifyAllObservers();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
