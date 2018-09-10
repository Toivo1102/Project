package org.itstep.qa.cyclesTwo;

import java.util.Scanner;

public class ParityChek {
    public static void main(String[] args) {
    /*Пользователь вводит целое число. Если число четное, то к нему прибавить 2,
    а если нечетное, то 1. Вывести результат
    */
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Введите целое число");
        number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + 2);
        } else System.out.println(number + 1);
    }
}
