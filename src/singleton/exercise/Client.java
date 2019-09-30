package singleton.exercise;

public class Client {

    public static void main(String[] args) {
        System.out.println("Calling the Captain for the first time");
        Captain captain = Captain.getInstance();

        System.out.println("Calling other Captain");
        Captain captain1 = Captain.getInstance();

        if ( captain == captain1) {
            System.out.println("It's the same captain");
        } else {
            System.out.println("Those are different captains");
        }


    }
}
