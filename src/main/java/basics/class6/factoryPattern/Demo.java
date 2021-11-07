package basics.class6.factoryPattern;

import basics.class6.factoryPattern.factory.ShapeFactory;

public class Demo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}