package Exceptions.Sem01.task1;

import java.util.Random;
import java.util.Scanner;

public class Prog {
    public static Boolean sumInArray(int[] array, int max){
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            tmp+=array[i];
        }
        if(tmp > max){
            return true;
        }
        return false;
    }
    public static int searchIndex(int[] array, int number) {
        if (array != null) {
            if (array.length <= 5) {
                return -1;
            } else {
                if((array[4] == 0)&&(sumInArray(array, 1000) == false)){
                    return -4;
                }else{
                    for (int i = 0; i < array.length; i++) { //sum<1000 & [4] < 0
                        if (array[i] == number) {
                            return i;
                        }
                    }
                    return -2;
                }

            }
        } else {
            return -3;
        }

    }

    public static void UI() {
        Scanner in = new Scanner(System.in);
        Boolean end = false;
        int choose = -1;
        while (end == false) {
            System.out.println("Which number?");
            try {
                choose = Integer.parseInt(in.next());
                end = true;
            } catch (Exception e) {
                System.out.println("Invalid number");
            }
        }
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(0,10);
            System.out.printf("%d ",array[i]);
            
        }
        int result = searchIndex(array, choose);
        switch (result) {
            case -1:
                System.out.println("Array is too short");
                break;
            case -2:
                System.out.printf("%d isnt in array\n", choose);
                break;
            case -3:
                System.out.println("it`s not array");
                break;
            case -4:
                System.out.println("any error");
                break;

            default:
                System.out.printf("%d has %d index\n", choose, result);
                break;
        }
    }

    public static void main(String[] args) {
        UI();
    }

}
/*
 * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и
 * некоторое значение. Метод ищет в массиве заданное значение и возвращает его
 * индекс. При этом, например:
 * если длина массива меньше некоторого заданного минимума, метод возвращает -1,
 * в качестве кода ошибки.
 * если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
 * если вместо массива пришел null, метод вернет -3
 * придумайте свои варианты исключительных ситуаций и верните соответствующие
 * коды ошибок.
 * Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть,
 * этот метод запросит искомое число у пользователя, вызовет первый, обработает
 * возвращенное значение и покажет читаемый результат пользователю. Например,
 * если вернулся -2, пользователю выведется сообщение: “Искомый элемент не
 * найден”.
 */