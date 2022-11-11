package Exceptions.Sem03.HW.Core.Presenter;

import Exceptions.Sem03.HW.Core.Logic.Interfaces.ICheckData;
import Exceptions.Sem03.HW.Core.Logic.Interfaces.IConsoleInput;
import Exceptions.Sem03.HW.Core.Logic.Interfaces.IErrors;
import Exceptions.Sem03.HW.Core.Logic.Interfaces.IFactory;
import Exceptions.Sem03.HW.Core.Logic.Interfaces.IMenu;
import Exceptions.Sem03.HW.Core.Logic.Interfaces.ISave;
import Exceptions.Sem03.HW.Core.Logic.Interfaces.ISuccess;

public class Presenter {
    private String path;
    ICheckData checkData;
    IConsoleInput input;
    IErrors errors;
    IMenu menu;
    ISave save;
    ISuccess suc;
    IFactory factory;

    public Presenter(String path, IFactory factory, ICheckData checkData, IConsoleInput input, IErrors errors,
            IMenu menu,
            ISave save, ISuccess suc) {
        this.path = path;
        this.checkData = checkData;
        this.input = input;
        this.errors = errors;
        this.menu = menu;
        this.save = save;
        this.suc = suc;
        this.factory = factory;
    }

    public void doThis() {
        String choose = "";
        while (!choose.equals("0")) {
            menu.showMenu();
            choose = input.getCommand();
            factory.makeOperations(path, choose, checkData, input, errors, save, suc);
        }
    }
}