package factory.exercise;

public class Client {
    public static void main(String[] args) {
        Animal tiger = AnimalFactory.getAnimalType("tiger");
        Animal duck = AnimalFactory.getAnimalType("duck");

        tiger.walk();
        duck.walk();
    }
}
