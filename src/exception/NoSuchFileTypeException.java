package exception;

/* Andrzej Kamiński */

public class NoSuchFileTypeException extends RuntimeException {
    public NoSuchFileTypeException(String message) {
        super(message);
    }
}
