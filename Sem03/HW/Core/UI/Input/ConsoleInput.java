package Exceptions.Sem03.HW.Core.UI.Input;

import java.util.Scanner;

import Exceptions.Sem03.HW.Core.Logic.Interfaces.IConsoleInput;

public class ConsoleInput implements IConsoleInput {
    Scanner input;

    public ConsoleInput() {
        input = new Scanner(System.in);
    }

    @Override
    public String getStringData() {
        System.out.println(
                "Input ur data separated by space: Surname, Name, Middle name, Birth day(dd.mm.yyyy), Phonenumber, Sex(f/m)");
        return input.nextLine();
    }

    @Override
    public String getCommand() {
        return input.nextLine();
    }
}
