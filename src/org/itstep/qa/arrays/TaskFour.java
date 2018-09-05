package org.itstep.qa.arrays;

import java.util.Random;

public class TaskFour {
    /*
    Задача 3
    Найти среднее арифметическое из значений массива из задачи 1
     */
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        double result = 0;
        Random random = new Random();  // объявление класса Random
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(150); // заполнение массива случайными числами
        }
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.println(result / array.length);
    }
}
