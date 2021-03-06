package basics.designPatterns.iteratorPattern.impl;

import basics.designPatterns.iteratorPattern.Iterator;

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
