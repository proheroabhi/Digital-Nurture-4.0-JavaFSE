// Logger.java - Singleton Class
public class Logger {

    // 1. Private static instance of the class
    private static Logger instance;

    // 2. Private constructor to prevent instantiation from other classes
    private Logger() {
        // Private constructor to restrict instantiation
    }

    // 3. Public static method to provide access to the single instance
    public static Logger getInstance() {
        // If instance is null, create the instance
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to simulate logging a message
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
