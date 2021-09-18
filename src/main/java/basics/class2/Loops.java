package basics.class2;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
        List<Integer> numbersArrayList = new ArrayList<>();

        numbersArrayList.add(0);
        numbersArrayList.add(1);
        numbersArrayList.add(2);

        // for loop #1 - loop over index/number
        for (int i = 0; i < numbersArrayList.size(); i++) {
            System.out.println(numbersArrayList.get(i));
        }

        // for loop #2 - loop over element
        for (Integer number : numbersArrayList) {
            System.out.println(number);
        }

        // while loop
        int i = 1;

        while (i < 5) {
            System.out.println("in while loop: i = " + i);
            i++;
        }

    }
}
