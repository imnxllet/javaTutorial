package basics.designPatterns.factoryPattern.factory;

import basics.designPatterns.factoryPattern.entities.Shape;
import basics.designPatterns.factoryPattern.entities.Rectangle;
import basics.designPatterns.factoryPattern.entities.Square;

public class ShapeFactory {
    //use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        else if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();

        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        }
        else {
            return null;
        }
    }
}