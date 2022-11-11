package Exceptions.Sem03.task1;

import java.io.IOException;

public class Prog {
    public static void doSomething() throws IOException{
        throw new IOException("Invalid Data");
    }
    public static void main(String[] args)  throws IOException{
        try {
            doSomething();
        } catch (IOException e) {
            throw new IOException("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Error++++++++++++++++++++++++++++++++++++++++++", e);
            //System.out.println(e.getMessage());
        } 
    }
}
/*
 * Создайте метод doSomething(), который может быть источником одного из типов
 * checked exceptions (тело самого метода прописывать не обязательно). Вызовите
 * этот метод из main и обработайте в нем исключение, которое вызвал метод
 * doSomething()
 */