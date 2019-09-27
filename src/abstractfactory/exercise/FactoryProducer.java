package abstractfactory.exercise;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("genre")) {
            return new GenreFactory();
        } else if (choice.equalsIgnoreCase("origin")) {
            return new OriginFactory();
        }
        return null;

    }
}
