package basics.abstractClassAndInterface;

import java.util.LinkedList;
import java.util.List;

/**
 * This class aims to showcase the hello world example using Java
 *
 * @author Chris Lu
 */
public class CarController { // class name has to be the same as the file name
    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    public static void main(String[] args) {
        CarService carService = new CarServiceImpl1();

        CarController carController = new CarController(carService);
        List<String> a = new LinkedList<>();
    }
}
