package basics.dataTypes;

/**
 * This class aims to showcase the data types of Java
 *
 * @author Chris Lu
 */
public class DataTypes {
    public static void main(String[] args) {
        // Primitive types: int, byte, short, long, float, double, boolean, and char
        boolean isTrue = true;
        boolean isFalse = false;
        int originalPrice = 26;
        double temperature = 39.1;
        char a = 'a';


        // Class types (String, Integer, Double, Vehicle - provided by Java or user defined)
        String helloWorldMessage = "Hello world!";

        Car myCar = new Car();
        myCar = null;

        // primitives can't be null or compared to null
        //char b = null;
        //isFalse = b == null;




        // Wrapper class for primitives
        Integer price = 22;
        price = null;

        Double retailPrice = 3.14;
        Boolean isCorrect = true;

        // boxing and unboxing
        originalPrice = price;

        // converting between numbers
        double chrisTemperature = 36.0;
        int hugoTemperature = (int) chrisTemperature; // casting
        price = retailPrice.intValue();
    }
}
