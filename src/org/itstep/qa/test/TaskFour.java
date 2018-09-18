package org.itstep.qa.test;

import java.util.Scanner;

public class TaskFour {
    /*
  Пользователь вводит целое трёхзначное число. Найти сумму цифр этого числа.
   */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Введите целое трехзначное число");
        number = scanner.nextInt();
        int sumNumber;
        sumNumber = number % 10 + (number / 10) % 10 + (number / 100) % 10;
        System.out.println("Cумма цифр этого числа равна " + sumNumber);
    }
}
