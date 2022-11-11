package Exceptions.Sem03.HW.Core.Logic.CheckData;

import Exceptions.Sem03.HW.Core.Exceptions.NullDataException;
import Exceptions.Sem03.HW.Core.Logic.Interfaces.ICheckData;

public class CheckData implements ICheckData {
    @Override
    public int checkStringData(String value) throws NullDataException {
        if (value != null) {
            String[] tmp = value.split(" ");
            if (tmp.length == 6) {
                return tmp.length;
            } else if (tmp.length > 6) {
                return -1;
            } else {
                return -2;
            }
        } else {
            throw new NullDataException("Data is null");
        }
    }
}