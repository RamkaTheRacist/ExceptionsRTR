package Exceptions.Sem03.HW.Core.Logic.Save;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Exceptions.Sem03.HW.Core.Logic.Interfaces.ISave;

public class Save implements ISave {
    @Override
    public void save(String[] array, String path) throws IOException {
        File file = new File(path);
        boolean append = file.exists();
        FileWriter writer = new FileWriter(path, append);
        writer.append(
                String.format("<%s><%s><%s><%s><%s><%s>\n", array[0], array[1], array[2], array[3], array[4],
                        array[5]));
        writer.flush();
        writer.close();
    }
}
