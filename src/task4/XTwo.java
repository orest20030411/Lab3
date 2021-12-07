package task4;

import java.lang.Math;

public class XTwo implements Runnable{
    public static double result;
    @Override
    public synchronized void run() {
        double D = main.b*main.b-4*main.a*main.c;
        result = (-main.b-Math.sqrt(D))/(2*main.a);
    }
}

