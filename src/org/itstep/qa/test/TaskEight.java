package org.itstep.qa.test;

import java.util.Scanner;

public class TaskEight {
    /*
 Пользователь вводит строку. Программа выводит количество
  символов самого длинного слова.
  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        System.out.println("Введите любую строку текста");
        line = scanner.nextLine();
        String[] result = line.split(" +");
        System.out.println(result);
        int test = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i].length() >= test) {
                test = result[i].length();
            }

        }
        System.out.println("Длина самого длинного слова в строке равна " + test);
    }
}
