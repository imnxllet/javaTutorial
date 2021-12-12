package basics.designPatterns.iteratorPattern.lectureExample.impl;

import basics.designPatterns.iteratorPattern.lectureExample.Iterator;

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
