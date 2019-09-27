package abstractfactory;

public abstract class AbstractFactory {
    // this is a bad design because then the factories have to implement not related methods.
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
