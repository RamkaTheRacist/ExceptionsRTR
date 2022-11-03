package Exceptions.Sem02.HW.task4;

public class ConsoleUI implements IConsoleUI {

    @Override
    public void showRes(String result) {
        System.out.printf("You wrote: %s\n", result);
    }

    @Override
    public void askFor() {
        System.out.println("Write string");
    }
}
