package bridge.exercise;

public class RedColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Filled with Red color with " + border + " inch border.");
    }
}
