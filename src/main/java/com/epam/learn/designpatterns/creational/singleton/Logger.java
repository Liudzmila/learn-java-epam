package main.java.com.epam.learn.designpatterns.creational.singleton;

public final class Logger {

    private static Logger INSTANCE;

    private Logger() {
    }

    // synchronized or enum instead of normal class
    public static synchronized Logger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    void log(String logMessage) {
        System.out.println(logMessage);
    }
}
