package Exceptions.Sem01.HW.task2;

public class Prog {
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        //sum2d(new String[5][5]);    //java.lang.NumberFormatException


        // String[][] matrix = new String[10][2];
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         matrix[i][j] = "1";
        //     }
        // }
        // sum2d(matrix);                  //java.lang.ArrayIndexOutOfBoundsException:


        //sum2d(null);          //java.lang.NullPointerException

        
    }
}
/*
 * 2.Посмотрите на код, и подумайте сколько разных типов исключений вы тут
 * сможете получить?
 **/