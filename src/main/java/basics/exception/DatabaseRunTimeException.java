package basics.exception;

/**
 * A runtime exception class which will be thrown when Database is unavailable to connect
 */
public class DatabaseRunTimeException extends RuntimeException {
    public DatabaseRunTimeException(String message) {
        super(message);
    }
}
