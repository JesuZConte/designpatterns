package builder.exercise;

public class VegBurger extends Burger {
    private float price;
    private String name;

    public VegBurger() {
        this.price = 10;
        this.name = "Vegan Burger";
    }

    public VegBurger(float price, String name) {
        super(price, name);
    }

    @Override
    public String toString() {
        return "VegBurger{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
