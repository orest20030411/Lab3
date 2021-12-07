package task4;

import java.util.Scanner;

public class main {
    public static int a, b, c;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Thread xOne = new Thread(new XOne());
        Thread xTwo = new Thread(new XTwo());

        System.out.println("Введіть рівняння по схемі: axx+bx+c=0");
        System.out.print("a = ");
        a = in.nextInt();
        System.out.print("b = ");
        b = in.nextInt();
        System.out.print("c = ");
        c = in.nextInt();

        System.out.print("Задане рівняння: " + a + "xx");   //виводить рівняння
        if (b>=0) System.out.print("+" + b + "x");
        else System.out.print(b + "x");
        if (c>=0) System.out.println("+" + c + "=0");
        else System.out.println(c + "=0");

        xOne.start();       //запускаємо потоки
        xTwo.start();
        try{                //чекаємо поки потоки закінчать роботу
            xOne.join();
            xTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Відповідь: x1 = " + XOne.result + " та x2 = " + XTwo.result);
    }
}

