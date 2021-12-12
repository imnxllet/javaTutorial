package basics.designPatterns.observerPattern.observer;

import basics.designPatterns.observerPattern.observable.Observable;

public class BinaryObserver implements Observer {
    private Observable observable;

    public BinaryObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Binary String is updated to " + Integer.toBinaryString((int) arg));
    }
}
