package Exceptions.Sem03.task3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MissingFileException extends IOException{
    public MissingFileException(String message){
        super("File is missing " + message);
    }
}
