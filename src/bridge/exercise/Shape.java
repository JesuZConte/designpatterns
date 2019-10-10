package bridge.exercise;

public abstract class Shape {

    protected IColor color;
    protected int border;


    public Shape(IColor color) {
        this.color = color;
        this.border = 1;
    }

    public abstract void drawShape();
    public abstract void modifyBorder(int times);

    public int getBorder() {
        return border;
    }

    public void setBorder(int border) {
        this.border = border;
    }
}
