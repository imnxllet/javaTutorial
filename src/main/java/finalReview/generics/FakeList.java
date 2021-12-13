package finalReview.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// [1, 2, 3]
// ["String", "ss"]
public class FakeList<T> {
    private List<T> realList = new LinkedList<>();

    public void add(T item) {
        realList.add(item);
    }

    public T get(int index) {
        return realList.get(index);
    }

    @Override
    public String toString() {
        return realList.toString();
    }

    public static void main(String[] args) {
        FakeList<Double> numbers = new FakeList<>();
        numbers.add(207.0);
        numbers.add(4.0);

        System.out.println(numbers);

        FakeList<String> sentence = new FakeList<>();
        sentence.add("同学们 ");
        sentence.add("Final 加油！");

        System.out.print(sentence.get(0));
        System.out.print(sentence.get(1));
    }
}
