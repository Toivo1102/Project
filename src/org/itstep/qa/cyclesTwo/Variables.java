package org.itstep.qa.cyclesTwo;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        /*Пользователь вводит 2 числа. Поменять их местами и вывести результат
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int numberOne;
        int numberTwo;
        numberOne = scanner.nextInt();
        numberTwo = scanner.nextInt();
        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberOne = (numberOne + numberTwo) - (numberTwo = numberOne));
        System.out.println(numberTwo);
    }
}
