package basics.designPatterns.observerPattern;

import basics.designPatterns.observerPattern.observable.Number;
import basics.designPatterns.observerPattern.observable.Observable;
import basics.designPatterns.observerPattern.observer.BinaryObserver;

public class Demo {
    public static void main(String[] args) {
        Observable number = new Number();

        number.addObserver(new BinaryObserver(number));

        System.out.println("Observable: 'number change to 15'");
        number.update(15);
    }
}
