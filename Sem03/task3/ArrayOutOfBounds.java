package Exceptions.Sem03.task3;

public class ArrayOutOfBounds extends RuntimeException{
    public ArrayOutOfBounds(String message, Exception e){
        super("Index out of range " + message, e);
    }
}
