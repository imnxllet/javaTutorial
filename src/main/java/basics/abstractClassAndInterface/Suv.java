package basics.abstractClassAndInterface;

public class Suv extends Car{
    private int capacity;

    @Override
    public void drive() {
        System.out.println("SUV is driving!");
    }
    @Override
    public void brake() {
        System.out.println("SUV is braking!");
    }
}
