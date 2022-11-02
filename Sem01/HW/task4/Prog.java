package Exceptions.Sem01.HW.task4;

import java.util.Random;

class MyException extends Exception {
    MyException(String str) {
        super(str);
    }
}

public class Prog {
    public static double[] anyMethod1(int[] firstArray, int[] secondArray) throws MyException { // Первый вариант обхода исключения
        if (firstArray.length != secondArray.length) {
            throw new MyException("Lengths of arrays aren`t same. Fix it, ffs -_-");
        } else {
            double[] result = new double[firstArray.length];
            for (int i = 0; i < result.length; i++) {
                result[i] = (double) firstArray[i] / secondArray[i];
            }
            return result;
        }
    }

    public static int[] anyMethod2(int[] firstArray, int[] secondArray) throws MyException { // Второй вариант - выброс исключения
        if (firstArray.length != secondArray.length) {
            throw new MyException("Lengths of arrays aren`t same. Fix it, ffs -_-");
        } else {
            int[] result = new int[firstArray.length];
            for (int i = 0; i < result.length; i++) {
                if(secondArray[i] == 0){
                    throw new MyException("Cant divide by zero");
                }
                result[i] = firstArray[i] / secondArray[i];
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
        for (int item : firstArray) {
            System.out.printf("%d ", item);
        }
        System.out.println();
        for (int item : secondArray) {
            System.out.printf("%d ", item);
        }
        double[] finalArray = anyMethod1(firstArray, secondArray);
        int[] tmp = anyMethod2(firstArray, secondArray);
        System.out.println();
        for (double item : finalArray) {
            System.out.printf("%.2f ", item);
        }
        System.out.println();

    }
}
/*
 * 4.* Реализуйте метод, принимающий в качестве аргументов два целочисленных
 * массива, и возвращающий новый массив, каждый элемент которого равен частному
 * элементов двух входящих массивов в той же ячейке. Если длины массивов не
 * равны, необходимо как-то оповестить пользователя. Важно: При выполнении
 * метода единственное исключение, которое пользователь может увидеть -
 * RuntimeException, т.е. ваше.
 */