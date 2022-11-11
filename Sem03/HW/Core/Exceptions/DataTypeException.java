package Exceptions.Sem03.HW.Core.Exceptions;

public class DataTypeException extends RuntimeException {
    public DataTypeException(String message, RuntimeException e) {
        super("Data type exception: " + message, e);
    }
}
