package basics.class5.exception;

/**
 * An checked exception class which will be thrown when Database is unavailable to connect
 */
public class DatabaseException extends Exception {
    public DatabaseException(String message) {
        super(message);
    }
}
