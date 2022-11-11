package Exceptions.Sem03.HW.Core.UI.Output;

import Exceptions.Sem03.HW.Core.Logic.Interfaces.ISuccess;

public class Success implements ISuccess {

    @Override
    public void saveSucc(String path) {
        System.out.println("Entry successfully saved");
    }
}
