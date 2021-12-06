package basics.class6.factoryPattern.factory;

import basics.class6.factoryPattern.entities.Shape;
import basics.class6.factoryPattern.entities.Rectangle;
import basics.class6.factoryPattern.entities.Square;

public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}