package Exceptions.Sem02.task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Prog {

    public static void loadFiles(String path, Map<String, String> result) {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String data = reader.readLine();
            while (data != null) {
                String[] tmp = data.split("=");
                result.put(tmp[0], tmp[1]);
                data = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void changeFiles(Map<String, String> result) {
        Set<String> keys = result.keySet();
        String[] tmpKeys = keys.toArray(new String[keys.size()]);
        for (int i = 0; i < result.size(); i++) {
            String tmp = result.get(tmpKeys[i]);
            if (tmp.equals("?")) {
                result.replace(tmpKeys[i], String.format("%d", new Random().nextInt(1, 10)));
            } else {
                try {
                    Integer.parseInt(tmp);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Invalid symbol");
                }
            }
        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\where\\Desktop\\Git\\Exceptions\\Sem02\\task3\\tmp.txt";
        Map<String, String> result = new HashMap<>();
        loadFiles(path, result);
        System.out.println(result);
        changeFiles(result);
        System.out.println(result);

    }
}
/*
 * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный
 * массив (либо HashMap, если студенты с ним знакомы). В отдельном методе нужно
 * будет пройти по структуре данных, если сохранено значение ?, заменить его на
 * соответствующее число.Если на каком-то месте встречается символ, отличный от
 * числа или ?, бросить подходящее исключение.Записать в тот же файл данные с
 * замененными символами ?.
 */