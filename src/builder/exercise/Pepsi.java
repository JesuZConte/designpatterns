package builder.exercise;

public class Pepsi extends Drink {
    private float price;
    private String name;

    public Pepsi() {
        this.price = 5;
        this.name = "Pepsi";
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
