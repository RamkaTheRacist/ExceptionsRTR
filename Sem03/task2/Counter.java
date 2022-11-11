package Exceptions.Sem03.task2;

import java.io.IOException;

public class Counter implements AutoCloseable{
    private int counter;
    public boolean close;

        public Counter() {
            counter = 0;
            close = false;
        }

        public void add() throws IOException {
            counter++;
        }

        @Override
        public void close()  {
            close = true;
        }
}