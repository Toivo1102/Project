package org.itstep.qa.cyclesOne;


import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
       /* Задача 3
          Перепишите программы из заданий 1 и 2 с использованием цикла while. */

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 100) {
            i++;
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        int j = 1;
        while (j < 100) {
            System.out.print(j + " ");
            j = j + 2;
        }
        System.out.println(" ");

       System.out.println("Введите целое число");
        int n;
        int b = 1;
        n = scanner.nextInt();
        int f = 1;
        while (f <= n) {
            b = b * f;
            f++;
        }
        System.out.println("Факториал = " + b);
    }
}
