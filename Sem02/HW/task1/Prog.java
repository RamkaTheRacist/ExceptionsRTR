package Exceptions.Sem02.HW.task1;

import java.util.Scanner;

public class Prog {
    public static float input(){
        Scanner in = new Scanner(System.in);
        float result = 0;
        System.out.println("Enter float number: ");
        while(true){
            try {
                result = Float.parseFloat(in.next());
                return result;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Write number ffs -_-");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(input());
    }
}
/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа
 * (типа float), и возвращает введенное значение. Ввод текста вместо числа не
 * должно приводить к падению приложения, вместо этого, необходимо повторно
 * запросить у пользователя ввод данных.
 */