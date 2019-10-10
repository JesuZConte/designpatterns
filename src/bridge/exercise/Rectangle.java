package bridge.exercise;

public class Rectangle extends Shape {

    public Rectangle(IColor color) {
        super(color);
        this.border = 50;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing a Rectangle.");
        color.fillWithColor(this.border);
    }

    @Override
    public void modifyBorder(int times) {
        System.out.println("Now we are changing the border length " + times + " times.");
        this.border = this.border * times;

    }


}
