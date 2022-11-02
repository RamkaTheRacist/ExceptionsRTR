package Exceptions.Sem01.HW.task3;

import java.util.Random;

class MyException extends Exception {
    MyException(String str) {
        super(str);
    }
}

public class Prog {
    public static int[] anyMethod(int[] firstArray, int[] secondArray) throws MyException {
        if (firstArray.length != secondArray.length) {
            throw new MyException("Lengths of arrays aren`t same. Fix it, ffs -_-");
        } else {
            int[] result = new int[firstArray.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = firstArray[i] - secondArray[i];
            }
            return result;
        }
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(0, 10);
        }
        return array;
    }

    public static void main(String[] args) throws MyException {
        int[] firstArray = createArray(6);
        int[] secondArray = createArray(6);
        int[] finalArray = anyMethod(firstArray, secondArray);
        for (int item : firstArray) {
            System.out.printf("%d ", item);
        }
        System.out.println();
        for (int item : secondArray) {
            System.out.printf("%d ", item);
        }
        System.out.println();
        for (int item : finalArray) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}
/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных
 * массива, и возвращающий новый массив, каждый элемент которого равен разности
 * элементов двух входящих массивов в той же ячейке. Если длины массивов не
 * равны, необходимо как-то оповестить пользователя.
 */