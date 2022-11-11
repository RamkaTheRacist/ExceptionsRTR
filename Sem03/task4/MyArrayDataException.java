package Exceptions.Sem03.task4;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(String message){
        super("Invalid data in matrix: " + message);
    }
}
