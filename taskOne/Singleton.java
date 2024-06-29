package taskOne;

public class Singleton {

    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {

    }

    // Public static method to get the instance of Singleton
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }

    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton = Singleton.getInstance();
        // Use the instance
        singleton.showMessage();
    }

}
