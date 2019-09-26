package factory.exercise;

public class AnimalFactory {

    public static Animal getAnimalType(String animalType) {
        String type = animalType.trim().toLowerCase();

        // do not add a break since the return is the last line executed.
        switch (type) {
            case "duck": return new Duck();
            case "tiger": return new Tiger();
            default: return null;
        }
    }
}
