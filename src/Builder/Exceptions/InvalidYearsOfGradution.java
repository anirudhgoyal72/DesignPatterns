package Builder.Exceptions;

public class InvalidYearsOfGradution extends RuntimeException{
    public InvalidYearsOfGradution() {
    }

    public InvalidYearsOfGradution(String message) {
        super(message);
    }

    public InvalidYearsOfGradution(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidYearsOfGradution(Throwable cause) {
        super(cause);
    }

    public InvalidYearsOfGradution(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
