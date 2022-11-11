package Exceptions.Sem03.task4;

public class Prog {
    public static void checkMatrix(String[][] matrix) {
        if ((matrix.length > 4) || (matrix[0].length > 4)) {
            throw new MyArraySizeException("Matrix is bigger than expected ", new RuntimeException());
        } else if ((matrix.length < 4) || (matrix[0].length < 4)) {
            throw new MyArraySizeException("Matrix is smaller than expected ", new RuntimeException());
        }
    }

    public static int sumOfElements(String[][] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    int tmp = Integer.parseInt(matrix[i][j]);
                    result += tmp;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Not number in %d %d", i, j));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String[][] any1 = new String[][]{{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        String[][] any2 = new String[][]{{"s","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        String[][] any3 = new String[][]{{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        String[][] any4 = new String[][]{{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        try {
            checkMatrix(any1);
            System.out.printf("Sum of elements: %d\n",sumOfElements(any1));
            // checkMatrix(any2);
            // System.out.printf("Sum of elements: %d\n",sumOfElements(any2));
            // checkMatrix(any3);
            // System.out.printf("Sum of elements: %d\n",sumOfElements(any3));
            // checkMatrix(any4);
            // System.out.printf("Sum of elements: %d\n",sumOfElements(any4));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        
    }
}
/*
 * Напишите метод, на вход которого подаётся двумерный строковый массив размером
 * 4х4. При подаче массива другого размера необходимо бросить исключение
 * MyArraySizeException.
 * 
 * 1. Далее метод должен пройтись по всем элементам массива, преобразовать в int
 * и просуммировать. Если в каком-то элементе массива преобразование не удалось
 * (например, в ячейке лежит символ или текст вместо числа), должно быть брошено
 * исключение MyArrayDataException с детализацией, в какой именно ячейке лежат
 * неверные данные.
 * 2. В методе main() вызвать полученный метод, обработать возможные исключения
 * MyArraySizeException и MyArrayDataException и вывести результат расчета
 * (сумму элементов, при условии что подали на вход корректный массив).
 */