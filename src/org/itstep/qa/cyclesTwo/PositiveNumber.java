package org.itstep.qa.cyclesTwo;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
    /*Ввести два действительных положительных числа. Вывести
    среднее арифметическое и среднее геометрическое этих чисел
    */
        Scanner scanner = new Scanner(System.in);
        double numberOne;
        double numberTwo;
        System.out.println("Введите два действительных положительных числа");
        numberOne = scanner.nextDouble();
        numberTwo = scanner.nextDouble();
        if (numberOne >= 0 && numberTwo >= 0) {
            System.out.println("Среднее арифметическое = " + (numberOne + numberTwo) / 2);
            System.out.println("Среднее геометрическое = " + Math.sqrt(numberOne * numberTwo));
        } else System.out.println("Числа неположительное");
    }
}
