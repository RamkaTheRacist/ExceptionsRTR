package Exceptions.Sem02.task2;

import java.util.Random;

public class Prog {
    public static int sum2d(String[][] arr) {
        int sum = 0;
        int val = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        val = Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        val = 0;
                    }
    
                    sum += val;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Array is null");
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] matrix = new String[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = String.format("%d", new Random().nextInt(1, 10));
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%s ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println(sum2d(matrix));
        matrix[2][3] = "adw";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%s ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println(sum2d(matrix));
        matrix[2][2] = null;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%s ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println(sum2d(matrix));
        System.out.println(sum2d(null));
    }
}
