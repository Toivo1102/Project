package org.itstep.qa.cyclesTwo;

import java.util.Scanner;

public class TriangleRectangular {
    public static void main(String[] args) {
    /*Ввести катеты прямоугольного треугольника.
     Вывести его гипотенузу и площадь
    */
        Scanner scanner = new Scanner(System.in);
        int catheterA;
        double catheterB;
        System.out.println("Введите катеты треугольника");
        catheterA = scanner.nextInt();
        catheterB = scanner.nextDouble();
        System.out.println("Гипотенуза = " + Math.sqrt(catheterA * catheterA + catheterB * catheterB));
        System.out.println("Площадь треугольника = " + (0.5 * catheterA * catheterB));

    }
}
