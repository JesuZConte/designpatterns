package builder.exercise;

public class Director {
    private BuilderInterface builder;

    public void construct(BuilderInterface builder, String burger, String drink) {
        this.builder = builder;
        this.builder.addBurger(burger);
        this.builder.addDrink(drink);
    }
}
