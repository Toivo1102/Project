package org.itstep.qa.cyclesOne;

import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        /* Задача 1
        При помощи цикла for вывести на экран нечетные числа от 1 до 99.
         */
       for (int i = 1; i < 100; i = i + 2) {

            System.out.print(i + " ");
        }
        System.out.println( " ");
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }


      /* Проверка того, что вводит пользователь с клавиатуры, и предлагать ему
      до тех пор пока он ее не введет

        System.out.println("Введите целое и только число");
        int inputValue = 0;
        while (true) {     // реализация бесконечного цикла
            if (scanner.hasNextInt()) {
                inputValue = scanner.nextInt();
                break;
            } else {
                System.out.println("Это не число. Попробуйте еще раз");
                scanner.nextLine();
            }
        }
        System.out.println("Итоговый результат " + inputValue);
        */



    }
}

