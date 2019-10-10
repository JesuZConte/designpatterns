package bridge.exercise;

public class Client {

    public static void main(String[] args) {
        System.out.println("******* Bridge Pattern *******");
        IColor greenColor = new GreenColor();
        IColor redColor = new RedColor();

        Shape triangle = new Triangle(greenColor);
        triangle.drawShape();
        triangle.modifyBorder(3);
        triangle.drawShape();
        System.out.println("*******************");
        Shape rectangle = new Rectangle(redColor);
        rectangle.drawShape();
        rectangle.modifyBorder(2);
        rectangle.drawShape();

    }
}
