package exception;

public class EmptyListException extends RuntimeException {

    public EmptyListException() {
        super("Cannot perform operation on an empty list");
    }
}
