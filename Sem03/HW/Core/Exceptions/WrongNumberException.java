package Exceptions.Sem03.HW.Core.Exceptions;

public class WrongNumberException extends NumberFormatException {
    public WrongNumberException(String message) {
        super(message);
    }
}
