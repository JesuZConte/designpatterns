package bridge;

public class Client {

    public static void main(String[] args) {
        Workshop producer = new Produce();
        Workshop assembler = new Assemble();
        Vehicle car = new Car(producer, assembler);
        car.manufacture();
        System.out.println("**************");
        Vehicle bike = new Bike(producer, assembler);
        bike.manufacture();
    }
}
