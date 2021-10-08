package basics.class3;

public class SportCar extends Car{
    private int maxSpeed;

    @Override
    public void drive() {
        System.out.println("SportCar is driving!");
    }
    @Override
    public void brake() {
        System.out.println("SportCar is braking!");
    }

    // overide getPrice from Car class
    @Override
    public int getPrice() {
        return 100000;
    }

    // method overloading
    public int getPrice(int year) {
        if (year > 2010) {
            return 100000;
        }


        return 50000;
    }
}
