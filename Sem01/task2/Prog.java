package Exceptions.Sem01.task2;

public class Prog {
    public static int sumInMatrix(int[][] matrix){

        int tmp = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if((matrix[i][j] != 0)&&(matrix[i][j] !=1) || (matrix.length != matrix[i].length)){
                    throw new RuntimeException("Shit happens");
                }
                tmp+=matrix[i][j];
            }
        }
        return tmp;
    }
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
            }
        }
        matrix[1][1] = 2;
        System.out.println(sumInMatrix(matrix));
        
    }
}
/*Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке. */
