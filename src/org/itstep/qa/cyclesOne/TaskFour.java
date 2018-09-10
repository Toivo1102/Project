package org.itstep.qa.cyclesOne;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
       /* Задача 4
         Даны переменные x и n. Вычислить x в степени n.  */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целые числа");
        int n;
        int x;
        long b = 1;
        n = scanner.nextInt();
        x = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            b = b * x;
        }
        System.out.println("Итого = " + b);

    }
}
