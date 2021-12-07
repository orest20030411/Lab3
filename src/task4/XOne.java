package task4;

public class XOne implements Runnable{
    static double result;
    @Override
    public synchronized void run() {
        double D = main.b*main.b-4*main.a*main.c;
        result = (-main.b+Math.sqrt(D))/(2*main.a);
    }
}

