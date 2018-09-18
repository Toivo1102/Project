package org.itstep.qa.test;

import java.util.Arrays;
import java.util.Scanner;

public class TaskSeven {
    /*
    Пользователь вводит строку текста. После этого вводит
     контрольное слово. Программа выводит результат - содержится
     контрольное слово в строке или нет.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String controlWorld;
        System.out.println("Введите любую строку текста");
        line = scanner.nextLine();

        System.out.println("Введите контрольное слово");
        controlWorld = scanner.next();

        if (controlWorld.contains("мыла")) {
            System.out.println("Контрольное слово есть в строке текста");
        } else {
            System.out.println("Контрольного слова нет в строке текста");
        }
    }
}
