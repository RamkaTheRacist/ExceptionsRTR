package Exceptions.Sem03.HW.Core.UI.Output;

import Exceptions.Sem03.HW.Core.Logic.Interfaces.IErrors;

public class Errors implements IErrors {

    @Override
    public void dataTypeError() {
        System.out.println("Invalid type of date");
    }

    @Override
    public void dataSizeError(int num) {
        if (num == -1) {
            System.out.println("Data is bigger than expected");
        } else if (num == -2) {
            System.out.println("Data is smaller than expected");
        }
    }

    @Override
    public void commandError() {
        System.out.println("Invalid command");
    }
}
