package org.itstep.qa.string;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        /*
        Изменить регистр введенного символа, если он был латинской буквой.
         */
        char letter = 'в';

            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                if (Character.isLowerCase(letter)) {
                    System.out.println(Character.toUpperCase(letter));
                } else {
                    System.out.println(Character.toLowerCase(letter));
                }

            } else System.out.println("Значение не является латинской буквой");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите один символ");
        String tempValue = scanner.nextLine();
        if (tempValue.length() == 1) {
            char ch = tempValue.charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (Character.isLowerCase(ch)) {
                    System.out.println("Резульат = " + Character.toUpperCase(ch));
                } else {
                    System.out.println("Результат = " + Character.toLowerCase(ch));
                }
            } else {
                System.out.println("Вы ввели не латинскую букву");
            }
        } else {
            System.out.println("Вы ввели слишком длинное значение");
        }

    }

}
