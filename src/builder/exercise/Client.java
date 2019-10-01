package builder.exercise;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        BuilderInterface builder = new MealBuilder();

        director.construct(builder, "veg", "pepsi");
        Meal meal = builder.getMeal();
        System.out.println(meal.toString());

    }
}
