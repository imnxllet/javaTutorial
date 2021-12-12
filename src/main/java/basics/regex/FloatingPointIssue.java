package basics.regex;

import java.math.BigDecimal;

public class FloatingPointIssue {
    public static void main(String[] args) {
        // example 1
        double i = 0;
        while (i < 1) {
            i += 0.1;
            System.out.println(i);
        }
        System.out.println(i == 1);

        System.out.println("\n ====== \n");

        // example 2
        float j = 0;
        while (j < 1) {
            j += 0.1;
            System.out.println(j);
        }
        System.out.println(j == 1);

        System.out.println("\n ====== \n");

        // example 2
        BigDecimal b = new BigDecimal("0");
        while (b.compareTo(BigDecimal.ONE)  != 0) {
            b = b.add(new BigDecimal("0.1"));
            System.out.println(b);
        }
        System.out.println(b.intValue() == 1);

         double sum = 300000000 + 0.0000000001;
        System.out.println(sum == 300000000);
    }
}
