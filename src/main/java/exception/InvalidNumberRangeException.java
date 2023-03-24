package exception;

public class InvalidNumberRangeException extends RuntimeException {
    public InvalidNumberRangeException() {
        super();
    }

    public InvalidNumberRangeException(String message) {
        super(message);
    }
}
