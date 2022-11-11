package Exceptions.Sem03.HW.Core.Logic.Parse;

import java.time.Year;

import Exceptions.Sem03.HW.Core.Exceptions.DataTypeException;
import Exceptions.Sem03.HW.Core.Exceptions.DataValueException;
import Exceptions.Sem03.HW.Core.Exceptions.WrongNumberException;

public class Parse {
    private String value;

    public Parse(String value) {
        this.value = value;
    }

    public String[] parseData()
            throws WrongNumberException, NumberFormatException, DataValueException, DataTypeException {
        String[] result = value.split(" ");
        String bd = result[3];
        int number = 0;
        try {
            number = Integer.parseInt(result[4]);
        } catch (NumberFormatException e) {
            throw new WrongNumberException("Wrong phone number format");
        }
        if (number <= 0) {
            throw new DataTypeException("Wrong phone number format", new RuntimeException());
        }
        if (result[5].length() == 1) {
            char sex = result[5].charAt(0);
            if ((sex != 'f') && (sex != 'm')) {
                throw new DataValueException("Wrong value of sex", new RuntimeException());
            }
        } else {
            throw new DataTypeException("Wrong sex format", new RuntimeException());
        }

        String[] bdTmp = bd.split("\\.");
        if (bdTmp.length == 3) {
            int day = Integer.parseInt(bdTmp[0]);
            int month = Integer.parseInt(bdTmp[1]);
            int year = Integer.parseInt(bdTmp[2]);
            if (year > Year.now().getValue()) {
                throw new DataValueException("Wrong value of year", new RuntimeException());
            }
            if ((month < 13) && (month > 0)) {
                if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)
                        || (month == 12)) {
                    if ((day < 0) || (day > 31)) {
                        throw new DataValueException("Wrong value of day", new RuntimeException());
                    }
                } else if (month == 2) {
                    if ((day < 0) || (day > 29)) {
                        throw new DataValueException("Wrong value of day", new RuntimeException());
                    }
                } else {
                    if ((day < 0) || (day > 30)) {
                        throw new DataValueException("Wrong value of day", new RuntimeException());
                    }
                }
            } else {
                throw new DataValueException("Wrong value of month", new RuntimeException());
            }
        } else {
            throw new DataTypeException("Wrong date format", new RuntimeException());
        }
        return result;
    }
}