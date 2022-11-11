package Exceptions.Sem03.task4;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(String message, RuntimeException e){
        super("Invalid size of matrix: " + message, e);
    }
}
