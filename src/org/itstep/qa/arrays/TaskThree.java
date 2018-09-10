package org.itstep.qa.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskThree {
    /*
    Задача 3
   Поменять местами первое и послднее значений массива из задачи 1
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
        System.out.println("В итоге получился массив");
        System.out.println(Arrays.toString(array));

        int temp = 0;
        temp = array [0];
        array [0] = array [array.length - 1];
        array[array.length - 1] = temp;
        System.out.println("Новый массив");
        System.out.println(Arrays.toString(array));
    }
}
