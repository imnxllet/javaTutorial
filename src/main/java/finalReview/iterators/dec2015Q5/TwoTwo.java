package finalReview.iterators.dec2015Q5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TwoTwo<T> implements Iterable<T>{
    List<T> items = new ArrayList<T>();

    @Override
    public Iterator<T> iterator() {
        return new TwoTwoIterator(items);
    }

    public void add(T item) {
        items.add(item);
    }


    public static void main(String[] args) {
        TwoTwo<String> twoTwoString = new TwoTwo<>();
        twoTwoString.add("Hello");
        twoTwoString.add("CSC207");

        for (String s : twoTwoString) {
            System.out.println(s);
        }

        TwoTwo<Integer> twoTwoInteger = new TwoTwo<>();
        twoTwoInteger.add(207);

        for (Integer s : twoTwoInteger) {
            System.out.println(s);
        }
    }
}
