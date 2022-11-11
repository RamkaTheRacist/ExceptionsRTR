package Exceptions.Sem03.HW.Core.Logic.Interfaces;

import java.io.IOException;

public interface ISave {
    void save(String[] array, String path) throws IOException;
}
