package bridge.exercise;

public class GreenColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Filled with Green color with " + border + " inch border.");
    }
}
