package org.itstep.qa.test;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Random;

public class TaskNine {
    /*
    Имеется двумерный массив, заполненный случайными значениями. Найти максимальный элемент этого массива.
     Вывести значение элемента, его индексы, а также значения его соседей в обоих  измерениях
Пример.
Массив:
1   2   4
7   9   8
4   5   6
Вывод на экран должен быть вида:
Максимальный элемент 9
Индексы: i = 1; j = 1
Значения соседей: 2, 7, 8, 5

     */
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arrayOne;
        arrayOne = new int[5][5];
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                arrayOne[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                System.out.print(arrayOne[i][j] + " ");
            }

            System.out.println();
        }

        //  максимальный элемент

        int max = Integer.MIN_VALUE, indexI = 0, indexJ = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[0].length; j++) {
                if (arrayOne[i][j] > max) {
                    max = arrayOne[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }

        System.out.println("Максимальное значение = " + max);
        System.out.println("Индекс i = " + indexI);
        System.out.println("Индекс j = " + indexJ);

        if (indexI == 0) {
            System.out.println("Соседа сверху нет");
        } else {
            System.out.println("Сосед сверху " + arrayOne[indexI - 1][indexJ]);
        }
        if (indexI == arrayOne.length - 1) {
            System.out.println("Соседа снизу нет");
        } else {
            System.out.println("Сосед снизу " + arrayOne[indexI + 1][indexJ]);
        }

        if (indexJ == 0) {
            System.out.println("Соседа слева нет");
        } else {
            System.out.println("Сосед слева " + arrayOne[indexI][indexJ - 1]);
        }
        if (indexJ == arrayOne.length - 1) {
            System.out.println("Соседа справа нет");
        } else {
            System.out.println("Сосед справа " + arrayOne[indexI][indexJ + 1]);
        }
    }
        /*
        int max = arrayOne[0][0];
        int a = 0;
        int b = 0;
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                if (arrayOne[i][j] >= max) {
                    max = arrayOne[i][j];
                    a = i;
                    b = j;
                }

            }

        }
        System.out.println("Максимальный элемент " + max);
        System.out.println("Индексы: i = " + a + "; " + " j = " + b);
        if (a > 0) {
            up = arrayOne[a - 1][b];
        }
        else {
            System.out.println("Соседа сверху нет");
        }
        if (a < arrayOne.length) {
            down = arrayOne[a + 1][b];
        }
        else {
            System.out.println("Соседа снизу нет");
        }
        if (b > 0) {
            left = arrayOne[a][b - 1];
        }
        else {
            System.out.println("Соседа слева нет");
        }
        if (b < arrayOne.length) {
            right = arrayOne[a][b + 1];
        }
        else {
            System.out.println("Соседа справа нет");
        }

        System.out.println(up);
        System.out.println(down);
        System.out.println(left);
        System.out.println(right);
*/
}




