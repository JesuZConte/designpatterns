package factory.staticmethodcreator;

import factory.concretecreator.Circle;
import factory.concretecreator.Rectangle;
import factory.concretecreator.Shape;
import factory.concretecreator.Triangle;

public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        String type = shapeType.trim().toUpperCase();
        switch (type) {
            case "CIRCLE": return new Circle();
            case "RECTANGLE": return new Rectangle();
            case "TRIANGLE": return new Triangle();
            default: return null;
        }
    }
}
