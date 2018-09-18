package org.itstep.qa.test;

import java.util.Arrays;
import java.util.Random;

public class TaskFive {
    public static void main(String[] args) {
        /*
        Найти максимальный и минимальный элементы ТРЕХ-мерного массива
         (заполнен случайными числами)
         */
        Random random = new Random();
        int[][][] arrayOne;
        arrayOne = new int[5][5][5];
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++)
                for (int c = 0; c < arrayOne[i].length; c++) {
                    arrayOne[i][j][c] = random.nextInt(300);
                }
        }
        int min = arrayOne[0][0][0];
        for(int i=0; i<arrayOne.length; i++) {
            for (int j = 0; j < arrayOne.length; j++) {
                for (int c = 0; c < arrayOne[i].length; c++) {
                    if (arrayOne[i][j][c] <= min) {
                        min = arrayOne[i][j][c];
                    }
                }
            }
        }

        System.out.println(min);

        int max = arrayOne[0][0][0];
        for(int i=0; i<arrayOne.length; i++) {
            for (int j = 0; j < arrayOne.length; j++) {
                for (int c = 0; c < arrayOne[i].length; c++) {
                    if (arrayOne[i][j][c] >= max) {
                        max = arrayOne[i][j][c];
                    }
                }
            }
        }

        System.out.println(max);

            for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++)
            for (int c = 0; c < arrayOne[i].length; c++)
            {
                System.out.print(arrayOne[i][j][c] + " ");
            }

            System.out.println();
        }


    }
}
