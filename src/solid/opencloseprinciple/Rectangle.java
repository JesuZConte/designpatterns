package solid.opencloseprinciple;

public class Rectangle implements Shape{
    public double length;
    public double width;


    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    public double radius;

    @Override
    public double calculateArea() {
        return (22/7) * radius * radius;
    }
}

// Using this class as a calculator would be a bad implementation, is not extensible.
// The best design would be to use an interface Shape and implement it in each class.
//class AreaCalculator {
//    public double calculateRectangleArea(Rectangle rectangle) {
//        return rectangle.length * rectangle.width;
//    }
//
//    public double calculateCircleArea(Circle circle) {
//        return (22/7) * circle.radius * circle.radius;
//    }
//}


// Now AreaCalculator would be:

class AreaCalculator {
    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}