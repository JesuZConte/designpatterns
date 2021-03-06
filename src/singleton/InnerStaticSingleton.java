package singleton;

public class InnerStaticSingleton {

    // no param constructor
    private InnerStaticSingleton(){}

    private static class Impl {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public InnerStaticSingleton getInstance() {
        return Impl.INSTANCE;
    }

    // this does not need synchronization and is simpler than the LazySingleton
}
