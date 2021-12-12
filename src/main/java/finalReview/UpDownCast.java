package finalReview;

import basics.abstractClassAndInterface.Car;
import basics.abstractClassAndInterface.SportCar;
import basics.abstractClassAndInterface.Suv;

public class UpDownCast {
    public static void main(String[] args) {
        Suv suv = new Suv();

        // upcast - done automatically/implicitly
        Car car = (Car) suv;

        // downcast - done implicitly
        suv = (Suv) car;

        // wrong downcast
        car = new SportCar();
        suv = (Suv) car;
    }
}
