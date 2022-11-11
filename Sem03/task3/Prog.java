package Exceptions.Sem03.task3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Prog {
    public static void main(String[] args) throws MissingFileException {
        //throw new ArrayOutOfBounds("Any error", new ArrayIndexOutOfBoundsException());
        // int[] arr = new int[0];
        // try {
        //     arr[10] = 0;
        // } catch (IndexOutOfBoundsException e) {
        //     throw new ArrayOutOfBounds(" ", e);
        // }
        // try {
        //     int any = 10 / 0;
        // } catch (ArithmeticException e) {
        //     throw new ZeroDivisionException(" ");
        // }
        try {
            FileReader ant = new FileReader("C:\\Users\\where\\Desktop\\Git\\Exceptions\\Sem03\\task3\\Prog123.java");
        } catch (FileNotFoundException e) {
            throw new MissingFileException("");
        }

    }

}
/*
 * 1. Создайте класс исключения, который будет выбрасываться при делении на 0.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 * 
 * 2. Создайте класс исключений, которое будет возникать при обращении к пустому
 * элементу в массиве ссылочного типа. Исключение должно отображать понятное для
 * пользователя сообщение об ошибке.
 * 
 * 3. Создайте класс исключения, которое будет возникать при попытке открыть
 * несуществующий файл. Исключение должно отображать понятное для пользователя
 * сообщение об ошибке.
 */