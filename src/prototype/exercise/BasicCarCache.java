package prototype.exercise;

import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String,BasicCar> carTable = new Hashtable<>();

    public static BasicCar getCar(String carName) {
        BasicCar cachedCar = carTable.get(carName);
        return (BasicCar) cachedCar.clone();
    }

    public static void loadCache() {
        Ford ford = new Ford();
        carTable.put(ford.getName(), ford);

        Nano nano = new Nano();
        carTable.put(nano.getName(), nano);
    }
}
