package basics.class5.generics;

import basics.class3.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface FactoryInterface<T> {
    public T getFirstCar();
}
