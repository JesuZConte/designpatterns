package abstractfactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        switch (color) {
            case "red": return new Red();
            case "blue": return new Blue();
            case "yellow": return new Yellow();
            default: return null;
        }
    }

    //this is design smell. Method that needs to be implemented and returns null
    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
