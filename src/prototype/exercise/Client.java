package prototype.exercise;

public class Client {
    public static void main(String[] args) {
        BasicCarCache.loadCache();

        BasicCar ford = (BasicCar) BasicCarCache.getCar("Ford");
        ford.setPrice(7f);

        System.out.println("Car name: " + ford.getName() + ", price: $" + ford.getPrice());

        BasicCar nano = (BasicCar) BasicCarCache.getCar("Nano");

        System.out.println("Car name: " + nano.getName() + ", price: $" + nano.getPrice());

    }
}
