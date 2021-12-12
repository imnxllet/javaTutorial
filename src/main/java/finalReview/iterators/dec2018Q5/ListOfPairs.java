package finalReview.iterators.dec2018Q5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfPairs<T> {
    private List<Pair<T>> contents = new ArrayList<>();

    public void addPair(T item1, T item2) {
        contents.add (new Pair(item1, item2)) ;
    }

    public T get (int index, int whichItem) {
        if (whichItem == 0) {
            return contents.get (index) .getItem1() ;
        } else {
            return contents.get (index) .getItem2() ;
        }
    }

    class Pair<T> {
        private T item1;
        private T item2;
        private Pair(T item1, T item2)
        {
            this. item1 = item1;
            this. item2 = item2;
        }
        T getItem1() {
            return item1;
        }
        T getItem2() {
            return item2;
        }
    }
}
