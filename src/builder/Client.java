package builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        BuilderInterface carBuilder = new CarBuilder();
        director.construct(carBuilder);
        Product product1 = carBuilder.getVehicle();
        product1.show();

        BuilderInterface motorcycleBuilder = new MotorcycleBuilder();
        director.construct(motorcycleBuilder);
        Product product2 = motorcycleBuilder.getVehicle();
        product2.show();


    }
}
