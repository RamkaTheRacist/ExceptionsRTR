package Exceptions.Sem03.HW.Core.Exceptions;

public class DataValueException extends RuntimeException {
    public DataValueException(String message, RuntimeException e) {
        super("Date value exception: " + message, e);
    }
}
