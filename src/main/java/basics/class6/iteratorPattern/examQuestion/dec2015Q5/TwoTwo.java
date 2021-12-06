package basics.class6.iteratorPattern.examQuestion.dec2015Q5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TwoTwo<T> implements Iterable<T>{
    List<T> items = new ArrayList<T>();

    @Override
    public Iterator<T> iterator() {
        return new TwoTwoIterator();
    }

    public void add(T item) {
        items.add(item);
    }

    private class TwoTwoIterator implements Iterator<T> {
        private int index = 0;
        private int counter = 0;
        private T item;
        private Iterator<T> itemIterator = items.iterator();

        @Override
        public boolean hasNext() {
            return index < items.size();
        }

        @Override
        public T next() {
            if (counter == 0) {
                item = itemIterator.next();
                counter++;
            } else if (counter == 1) {
                counter = 0;
                index++;
            }

            return item;
        }
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
