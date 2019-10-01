package builder;

public class MotorcycleBuilder implements BuilderInterface {

    private Product product = new Product();
    @Override
    public void buildBody() {
        product.add("This is the body of a Motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("1 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
