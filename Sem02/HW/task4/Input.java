package Exceptions.Sem02.HW.task4;

import java.util.Scanner;

public class Input implements IInput {
    Scanner in;

    public Input() {
        in = new Scanner(System.in);
    }

    @Override
    public String method1() {
        return in.nextLine();
    }

}
