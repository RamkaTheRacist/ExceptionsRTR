package Exceptions.Sem01.HW.task1;

import java.util.Scanner;

public class Prog {
    static public void er1(){
        String tmp = "daw";
        int error = Integer.parseInt(tmp);
        System.out.println(error);
    }
    static public int er2(){
        return 10/0;
    }
    static public void er3(){
        Scanner in = new Scanner(System.in);
        int tmp = in.nextInt();
    }
    public static void main(String[] args) {
        er1();  //java.lang.NumberFormatException
        er2();  //java.lang.ArithmeticException
        er3();  //java.util.InputMismatchException
    }
}
/*1.Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */