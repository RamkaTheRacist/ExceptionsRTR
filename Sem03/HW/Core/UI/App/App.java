package Exceptions.Sem03.HW.Core.UI.App;

import Exceptions.Sem03.HW.Core.Logic.CheckData.CheckData;
import Exceptions.Sem03.HW.Core.Logic.Factory.Factory;
import Exceptions.Sem03.HW.Core.Logic.Save.Save;
import Exceptions.Sem03.HW.Core.Presenter.Presenter;
import Exceptions.Sem03.HW.Core.UI.Input.ConsoleInput;
import Exceptions.Sem03.HW.Core.UI.Output.Errors;
import Exceptions.Sem03.HW.Core.UI.Output.Menu;
import Exceptions.Sem03.HW.Core.UI.Output.Success;

public class App {
    public void app() {
        String path = "C:\\Users\\where\\Desktop\\Git\\Exceptions\\Sem03\\HW\\Files";
        Presenter pres = new Presenter(path, new Factory(), new CheckData(), new ConsoleInput(), new Errors(),
                new Menu(), new Save(), new Success());
        pres.doThis();
    }
}