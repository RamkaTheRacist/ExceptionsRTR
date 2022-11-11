package Exceptions.Sem03.HW.Core.Exceptions;

public class NullDataException extends NullPointerException {
    public NullDataException(String message) {
        super("Input data exception: " + message);
    }
}
