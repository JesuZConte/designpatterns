package builder.exercise;

public class ChickenBurger extends Burger {
    private float price;
    private String name;

    public ChickenBurger() {
        this.price = 12;
        this.name = "Chicken Burger";
    }

    public ChickenBurger(float price, String name) {
        super(price, name);
    }

    @Override
    public String toString() {
        return "ChickenBurger{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
