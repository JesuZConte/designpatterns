package builder;

public class Director {

    private BuilderInterface myBuilder;

    public void construct(BuilderInterface builder) {
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.addHeadLights();
        myBuilder.insertWheels();
    }
}
