package org.itstep.qa.cyclesOne;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* Задача 5*
       Придумать способ ввода 3-х целых чисел с проверкой того, что пользователь вводит целые числа.
       Если пользователь допускает ошибку – дать ему возможность ввести число повторно.
       (Для очистки входного потока можно использовать метод nextLine()). */

        System.out.println("Введите целое число");
        int i = 0; //  контроль ввода целого числа
        do {
            if (scanner.hasNextInt()) {
                i++;
                scanner.nextLine();
            } else {
                System.out.println("Это не целое число. Попробуйте еще раз");
                scanner.nextLine();
            }

        } while (i < 3);

    }
}
