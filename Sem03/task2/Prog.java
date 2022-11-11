package Exceptions.Sem03.task2;

import java.io.IOException;

public class Prog {
    public static void main(String[] args) throws IOException{
        // Counter counter = new Counter();
        // try{  
        //     counter.add();
        //     counter.close();
        // }catch(IOException e){
        //     System.out.println("any");
        // }finally{
        //     if(counter.close == false){
        //         throw new IOException("Not closed");
        //     }
        // }
        try (Counter counter = new Counter()) {
            counter.add();
        } catch (Exception e) {
            System.out.println("any");
        }
    }
}
/*
 * Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
 * внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
 * можно было работать в блоке try-with-resources. Нужно бросить исключение,
 * если работа с объектом типа счетчик была не в ресурсном try и/или ресурс
 * остался открыт. Подумайте какой тип исключения подойдет лучше всего.
 */