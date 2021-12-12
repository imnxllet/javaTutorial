package basics.abstractClassAndInterface;

/**
 * A class which represents car objects
 */
public abstract class Car {
    private String color;
    private String model;
    private int year;

    public String getCarDetails() {
        return this.color + this.model + this.year;
    }

    public int getPrice() {
        if (this.year > 2020) {
            return 100000;
        }
        else {
            return 50000;
        }
    }

    public void drive() {
        System.out.println("Car is driving!");
    }

    abstract void brake();
}
