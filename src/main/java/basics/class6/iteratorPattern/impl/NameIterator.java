package basics.class6.iteratorPattern.impl;

import basics.class6.iteratorPattern.Iterator;

public class NameIterator implements Iterator {
    private int index;
    private String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public boolean hasNext() {

        if (index < names.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        if (this.hasNext()) {
            return names[index++];
        }
        return null;
    }
}
