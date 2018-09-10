package org.itstep.qa.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    /* Задача 2
   Объявить массив целых чисел длиной 10 элементов.
Ввести значения для элементов массива с клавиатуры, сделать проверку правильности ввода
 элемента типа Integer, если элемент введен неправильно – дать возможность повторить его ввод.
Вывести массив на экран.

    */
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            do {
                System.out.println("Введите только целое число");
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Это не число. Попробуйте еще раз");
                    scanner.next();
                }
            } while (true);
        }
            System.out.println("В итоге получился массив" );

            System.out.println(Arrays.toString(array));
        }
    }




