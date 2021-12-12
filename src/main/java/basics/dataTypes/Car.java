package basics.dataTypes;

/**
 * A class which represents car objects
 */
public class Car {
    private static String DEFAULT_MESSAGE = "This is string constant!";

    // Instance variables
    public String color;
    private String model;
    private int year;

    // No-arguments constructor (Java will help you create this one if no constructor is defined)
    // Create a Car object with no initial color, model, year
    public Car() {
    }

    // Constructor with passed-in instance variable values
    // Create a Car object with initial color, model, year values
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method must have access modifier: public, protected, private
    // Method must declare its return type (void means return nothing)
    private void printVehicleInfo() {
        System.out.println(this.computeVehicleInfo());
    }

    public void drive() {
        System.out.println("this car is driving...");
    }

    public void brake() {
        System.out.println("this car is braking...");
    }

    private String computeVehicleInfo() {
        return "Car info: "+ color + ", " + this.model + ", " + this.year;
    }

    // Getters and setters for the instance variables
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private static void printStringConstant() {
        System.out.println(DEFAULT_MESSAGE);
    }

    // Main method
    public static void main(String[] args) {
        // Create a new instance of class Vehicle
        // Local variables
        Car tesla = new Car();
        String color = "red";
        int year = 2019;
        tesla.setColor(color);
        tesla.setModel("Model 3");
        tesla.setYear(year);

        tesla.printVehicleInfo();

        // Create a new instance of class Vehicle using a different constructor
        Car audi = new Car("Black", "S5", 2020);
        audi.printVehicleInfo();

        Car.printStringConstant();
    }
}
