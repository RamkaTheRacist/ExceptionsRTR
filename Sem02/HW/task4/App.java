package Exceptions.Sem02.HW.task4;

public class App {
    IConsoleUI ui;
    IInput input;

    public App(IConsoleUI ui, IInput input) {
        this.ui = ui;
        this.input = input;
    }

    public void action() throws MyException {
        String tmp = "";
        ui.askFor();
        tmp = input.method1();
        if(tmp.equals("")){
            throw new MyException("Empty string not supported");
        }else{
            ui.showRes(tmp);
        }

    }
}
