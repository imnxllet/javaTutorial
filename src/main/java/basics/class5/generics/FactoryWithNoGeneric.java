package basics.class5.generics;

import basics.class3.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FactoryWithNoGeneric {
    // Method using generics
    public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // Correct
        }
    }

    // wildcard usage
    public static void printArray(List<? extends Car> c) {
        for (Car o : c) {
            System.out.println(c);
        }
    }
}
