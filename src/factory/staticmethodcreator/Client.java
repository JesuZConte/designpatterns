package factory.staticmethodcreator;

import factory.concretecreator.Shape;

public class Client {
    public static void main(String[] args) {

        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape triangle = ShapeFactory.getShape("trianGle");
        triangle.draw();
    }
}
