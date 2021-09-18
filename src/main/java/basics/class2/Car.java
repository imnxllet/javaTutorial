package basics.class2;

/**
 * A class which represents car objects
 */
public class Car {
    private static int TOTAL_KM = 0;

    static {
        TOTAL_KM = 1;
        TOTAL_KM = 0;
    }

    private static void printTotalKm() {
        System.out.println(TOTAL_KM);
    }

    private void driveOneKm() {
        TOTAL_KM++;
    }

    public static void main(String[] args) {
        Car audi = new Car();
        Car tesla = new Car();

        Car.printTotalKm();


        audi.driveOneKm();
        tesla.driveOneKm();

        Car.printTotalKm();
    }
}
