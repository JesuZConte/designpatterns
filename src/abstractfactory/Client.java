package abstractfactory;

public class Client {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        Shape square = shapeFactory.getShape("square");
        square.draw();

    }
}
