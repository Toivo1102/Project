package org.itstep.qa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFour {
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
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                temp ++;
            }
        }
        System.out.println("Количество нулевых элементов равно " + temp);
    }
}
