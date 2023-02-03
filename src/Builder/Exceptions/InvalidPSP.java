package Builder.Exceptions;

public class InvalidPSP extends RuntimeException{
    public InvalidPSP() {
    }

    public InvalidPSP(String message) {
        super(message);
    }

    public InvalidPSP(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPSP(Throwable cause) {
        super(cause);
    }

    public InvalidPSP(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
