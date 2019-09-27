package singleton.synchronizedmethod;

public class Singleton {

    // the private reference to the one and only instance
    private static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;


    // Private Constructor so no Client can instantiate it
    private Singleton() {
    }

    // by adding the synchronized keyword, we force every thread to wait for its turn before it can enter the method.
    public synchronized static Singleton getInstance() {
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
