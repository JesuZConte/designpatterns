package prototype.example;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeTable = new Hashtable<>();

    public static Shape getShape(String shapeKey) {
        Shape cachedShape = shapeTable.get(shapeKey);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setKey("1");
        shapeTable.put(circle.getKey(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setKey("2");
        shapeTable.put(rectangle.getKey(), rectangle);

        Square square = new Square();
        square.setKey("3");
        shapeTable.put(square.getKey(), square);
    }
}
