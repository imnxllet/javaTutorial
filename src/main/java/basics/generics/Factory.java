package basics.generics;

import basics.abstractClassAndInterface.Car;

import java.util.ArrayList;
import java.util.List;

public class Factory<T extends Car> implements FactoryInterface {
    List<T> cars;

    public T getFirstCar() {
        return cars.get(0);
    }

    // Why do we use "? extends Number"
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        //numbers = integers;

        List<? extends Number> numberss = new ArrayList<>();
        List<Integer> integerss = new ArrayList<>();

        numberss = integerss;
    }
}
