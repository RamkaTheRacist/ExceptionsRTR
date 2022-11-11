package Exceptions.Sem03.HW.Core.Logic.Factory;

import java.io.IOException;

import Exceptions.Sem03.HW.Core.Exceptions.DataTypeException;
import Exceptions.Sem03.HW.Core.Exceptions.DataValueException;
import Exceptions.Sem03.HW.Core.Exceptions.WrongNumberException;
import Exceptions.Sem03.HW.Core.Logic.Interfaces.ICheckData;
import Exceptions.Sem03.HW.Core.Logic.Interfaces.IConsoleInput;
import Exceptions.Sem03.HW.Core.Logic.Interfaces.IErrors;
import Exceptions.Sem03.HW.Core.Logic.Interfaces.IFactory;
import Exceptions.Sem03.HW.Core.Logic.Interfaces.ISave;
import Exceptions.Sem03.HW.Core.Logic.Interfaces.ISuccess;
import Exceptions.Sem03.HW.Core.Logic.Parse.Parse;

public class Factory implements IFactory {
    @Override
    public void makeOperations(String path, String choose, ICheckData checkData, IConsoleInput input, IErrors errors,
            ISave save, ISuccess suc) {
        switch (choose) {
            case "1":
                String contact = input.getStringData();
                if (checkData.checkStringData(contact) == 6) {
                    try {
                        String[] array = new Parse(contact).parseData();
                        String currentPath = path + "\\" + array[0] + ".txt";
                        save.save(array, currentPath);
                        suc.saveSucc(currentPath);
                    } catch (WrongNumberException e) {
                        System.out.println(e.getMessage());
                    } catch (NumberFormatException e) {
                        errors.dataTypeError();
                    } catch (DataTypeException e) {
                        System.out.println(e.getMessage());

                    } catch (DataValueException e) {
                        System.out.println(e.getMessage());
                    } catch (IOException e) {
                        System.out.println(e.getStackTrace());
                    }
                } else {
                    errors.dataSizeError(checkData.checkStringData(contact));
                }
                break;
            case "0":
                break;
            default:
                errors.commandError();
                break;
        }

    }

}
