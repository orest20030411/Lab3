package task2;

import java.io.IOException;

public class Sample implements AutoCloseable {
    public void read() throws IOException{
        if(true){
            throw new IOException();
        }
    }

    @Override
    public void close()  {
        System.out.println("Closed");
    }
}
