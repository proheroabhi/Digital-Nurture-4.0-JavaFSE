// SingletonTest.java - Testing the Singleton Pattern
public class SingletonTest {

    public static void main(String[] args) {
        // Get the instance of Logger (first call)
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        // Get the instance of Logger (second call)
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("logger1 and logger2 are different instances.");
        }
    }
}
