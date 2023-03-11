package ParkingLot.exceptions;

public class NoParkingSlotException extends RuntimeException{
    public NoParkingSlotException() {
        super();
    }

    public NoParkingSlotException(String message) {
        super(message);
    }

    public NoParkingSlotException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoParkingSlotException(Throwable cause) {
        super(cause);
    }

    protected NoParkingSlotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
