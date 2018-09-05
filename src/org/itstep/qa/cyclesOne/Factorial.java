package org.itstep.qa.cyclesOne;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       /* Задача 2
        Дано число n. При помощи цикла for определить факториал n!
                (Определение n! = 1*2*3*…*n, 0! = 1) */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int n;
        int b = 1;
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            b = b * i;
        }
        System.out.println("Факториал = " + b);

       /*
        int n;
        int b = 1;
        n = scanner.nextInt();

        int i = 1;
        do {
            b = b * i;
            i++;
        }
        while (i <= n);

        System.out.println("Факториал = " + b);

      */
    }
}
