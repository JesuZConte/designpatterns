package factory.concretecreator;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        String type = shapeType.trim().toUpperCase();
        switch (type) {
            case "CIRCLE": return new Circle();
            case "RECTANGLE": return new Rectangle();
            case "TRIANGLE": return new Triangle();
            default: return null;
        }
    }
}
