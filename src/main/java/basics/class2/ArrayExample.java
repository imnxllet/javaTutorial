package basics.class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {
        // initialize an array
        int[] numbersArray = new int[3];
        int[] numbersArray1 = new int[] {1, 2, 3};

        // initialize an ArrayList
        List<Integer> numbersArrayList = new ArrayList<>();

        // put elements in the arrays
        numbersArray[0] = 1;
        numbersArray[1] = 2;
        numbersArray[2] = 3;

        numbersArrayList.add(0);
        numbersArrayList.add(1);
        numbersArrayList.add(2);

        System.out.println(numbersArray);
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(numbersArrayList);

        //numbersArrayList = Arrays.asList(numbersArray);

        Integer[] numbersArray2 = new Integer[3];
        numbersArrayList = Arrays.asList(numbersArray2);
    }
}
