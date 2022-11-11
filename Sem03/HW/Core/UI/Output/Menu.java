package Exceptions.Sem03.HW.Core.UI.Output;

import Exceptions.Sem03.HW.Core.Logic.Interfaces.IMenu;

public class Menu implements IMenu {

    @Override
    public void showMenu() {
        System.out.println("(1)Input data\n(0)Close app");
    }
}
