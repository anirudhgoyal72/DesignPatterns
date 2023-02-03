package Builder.Exceptions;

public class InvalidYearsOfExperience extends RuntimeException{
    public InvalidYearsOfExperience() {
    }

    public InvalidYearsOfExperience(String message) {
        super(message);
    }

    public InvalidYearsOfExperience(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidYearsOfExperience(Throwable cause) {
        super(cause);
    }

    public InvalidYearsOfExperience(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
