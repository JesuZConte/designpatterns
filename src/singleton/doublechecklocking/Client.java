package singleton.doublechecklocking;

public class Client {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.setData(55);
        System.out.println("The data is: " + singleton.getData());
    }
}
