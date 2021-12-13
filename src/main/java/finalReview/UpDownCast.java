package finalReview;

import basics.abstractClassAndInterface.Car;
import basics.abstractClassAndInterface.SportCar;
import basics.abstractClassAndInterface.Suv;

import java.util.ArrayList;
import java.util.List;

public class UpDownCast {
    public static void main(String[] args) {
        Suv suv = new Suv();

        // upcast - done automatically/implicitly
        Car car = (Car) suv;
        List<String> list = (List) new ArrayList<>();

        // downcast - done implicitly
        if (car instanceof Suv) {
            suv = (Suv) car;
        }


        // wrong downcast
        car = new SportCar();
        //suv = (Suv) car;
    }
}
