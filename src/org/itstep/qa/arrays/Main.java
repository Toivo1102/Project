package org.itstep.qa.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    /* Задача 1
    Объявить массив целых числе длиной 10 элементов.
    Задать случайные значения для элементов массива.
    Вывести массив на экран
     */
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        Random random = new Random();  // объявление класса Random
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(150); // заполнение массива случайными числами
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int[][] arrayOne;
        arrayOne = new int[10][5];
        for (int i = 0; i < arrayOne.length; i++) {     // заполнение двумерного массива
            for (int j = 0; j < arrayOne[i].length; j++) {
                arrayOne[i][j] = random.nextInt(300);
            }
        }
        System.out.println(Arrays.toString(arrayOne));
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {   // вывод двумерного массива
                System.out.print(arrayOne[i][j] + " ");
            }

            System.out.println();
        }
    }
}