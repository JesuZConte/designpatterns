package bridge.exercise;

public class Triangle extends Shape {

    // Yo pondría el borde por parámetro, pero bueno... como ejemplo solamente lo inicializamos en un entero cualquiera.
    public Triangle(IColor color) {
        super(color);
        this.border = 20;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing a Triangle.");
        color.fillWithColor(this.border);
    }

    @Override
    public void modifyBorder(int times) {
        System.out.println("Now we are changing the border length " + times + " times.");
        this.border = this.border * times;

    }
}
