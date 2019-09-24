import prototype.*;
import singleton.BasicSingleton;

public class Main {

    public static void main(String[] args) {
//        Line line1 = new Line(new Point(3,2), new Point(5,5));
//        Line line2 = line1.deepCopy();
//
//
//
//        System.out.println(line1.toString());
//        System.out.println(line2.toString());
//
//        line2.setStart(new Point(1,7));
//        System.out.println(line1.toString());
//        System.out.println(line2.toString());

        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        basicSingleton.setValue(123);

        System.out.println("The singleton value is: " + basicSingleton.getValue());
    }
}
