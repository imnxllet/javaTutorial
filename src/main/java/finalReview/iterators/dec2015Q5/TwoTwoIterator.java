package finalReview.iterators.dec2015Q5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TwoTwoIterator<T> implements Iterator<T> {
    private int index = 0;
    private int counter = 0;
    private T item;
    List<T> items;

    public TwoTwoIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.size();
    }

    @Override
    public T next() {
        if (counter == 0) {
            item = items.get(index);
            counter++;
        } else if (counter == 1) {
            counter = 0;
            index++;
        }

        return item;
    }
}