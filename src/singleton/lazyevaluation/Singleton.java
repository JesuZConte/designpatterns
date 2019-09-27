package singleton.lazyevaluation;

public class Singleton {

    // the private reference to the one and only instance
    private static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;


    // Private Constructor so no Client can instantiate it
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
