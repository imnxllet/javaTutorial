package basics.class6.strategyPattern;

import basics.class6.strategyPattern.impl.AdditionStrategy;
import basics.class6.strategyPattern.impl.SubtractionStrategy;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new AdditionStrategy());
        System.out.println("Addition Strategy's result = " + context.executeStrategy(10, 5));

        context = new Context(new SubtractionStrategy());
        System.out.println("Subtraction Strategy's result = " + context.executeStrategy(10, 5));
    }
}
