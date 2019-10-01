package builder.exercise;

public interface BuilderInterface {
    void addDrink(String type);
    void addBurger(String type);
    Meal getMeal();
}
