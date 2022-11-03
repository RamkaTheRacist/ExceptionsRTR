package Exceptions.Sem02.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int index = -1;
        boolean end = false;
        while (!end) {
            try {
                System.out.println("Choose index of array`s element in which u wanna change");
                index = Integer.parseInt(scanner.nextLine());
                arr[index] = 1;
                end = true;
                scanner.close();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index isnt in array");
            } catch (NumberFormatException e) {
                System.out.println("Wtf are u writting?");
            }
        }

    }
}
