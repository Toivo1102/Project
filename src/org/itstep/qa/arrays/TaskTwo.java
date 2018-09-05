package org.itstep.qa.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    /* Задача 2
   Объявить массив целых чисел длиной 10 элементов.
Ввести значения для элементов массива с клавиатуры.
Вывести массив на экран.
Повышенной сложности: сделать проверку правильности
ввода элемента типа Integer, если элемент введен неправильно – дать
возможность повторить его ввод.
    */
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите только целое число");
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();

            } else {
                System.out.println("Это не число. Попробуйте еще раз");
                scanner.nextLine();
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


}



/*
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