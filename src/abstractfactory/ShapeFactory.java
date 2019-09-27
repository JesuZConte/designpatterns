package abstractfactory;

public class ShapeFactory extends AbstractFactory {

    //this is design smell. Method that needs to be implemented and returns null
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        switch (shape) {
            case "triangle": return new Triangle();
            case "square": return new Square();
            case "rectangle": return new Rectangle();
            default: return null;
        }
    }
}
