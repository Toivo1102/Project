package org.itstep.qa.test;

import java.util.Scanner;

public class TaskOne {
    /*
    Ввести длину ребра куба с клавиатуры. Вывести объем куба и площадь его боковой поверхности.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edge;
        int power = 3;
        int powerTwo = 2;
        System.out.println("Введите длину куба");
        edge = scanner.nextInt();
        System.out.println("Объем куба равен " + Math.pow(edge, power) );

        System.out.println("Площадь боковой поверхности куба равна " + Math.pow(edge, powerTwo));
    }
}
