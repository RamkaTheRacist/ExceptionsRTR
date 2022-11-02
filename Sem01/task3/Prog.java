package Exceptions.Sem01.task3;

public class Prog {
    public static int er1() {
        int tmp = 10 / 0;
        return tmp;
    }

    public static int[] er2() {
        int[] tmp = new int[10];
        tmp[100] = 1;
        return tmp;
    }
    public static void er3(){
        String tmp = null;
        System.out.println(tmp.length());
    }
    public static void er4(){
        String tmp = "10e2";
        Integer.parseInt(tmp);
    }
    public static void er5(){
        Object obj = "5";
        Integer tmp = null;
        tmp = (Integer)obj;
        System.out.println(tmp);
    }

    public static void main(String[] args) {
        er5();
    }
}
/*
 * Создайте несколько методов, в каждом из которых, на этапе выполнения, JVM
 * выбросит исключение.
 * В методе создается целочисленная переменная, которая инициализируется
 * значением 10 / 0
 * В методе создается целочисленный массив длиной 10, и в ячейку этого массива с
 * индексом 100 записывается значение 1
 * В методе создается строка и инициализируется значением null, затем в консоль
 * выводится длина этой строки
 * В методе создается строка и инициализируется значением “10e2”, далее строка
 * преобразуется к целому числу с помощью метода Integer.parseInt()
 * В методе создается переменная типа Object, в которую записывается строка “5”,
 * попробуйте перенести значение этой переменной в другую переменную с типом
 * Integer (т.е. нужно будет сделать каст из Object в Integer)
 */