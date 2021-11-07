package basics.class6.factoryPattern.impl;

import basics.class6.factoryPattern.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
