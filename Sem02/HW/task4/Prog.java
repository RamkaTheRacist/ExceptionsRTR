package Exceptions.Sem02.HW.task4;

public class Prog {
    public static void main(String[] args) throws MyException {
        new App(new ConsoleUI(), new Input()).action();
    }
}
/*
 * 3. Разработайте программу, которая выбросит Exception, когда пользователь
 * вводит пустую строку. Пользователю должно показаться сообщение, что пустые
 * строки вводить нельзя.
 */