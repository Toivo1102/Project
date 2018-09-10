package org.itstep.qa.string;

import java.util.Scanner;

public class TaskTwo {
    /*Создать строку и проинициализировать ее каким-либо значением
    * Вывести значение строки на экран.
    * Присвоить этой же строке значение введенное с клавиатуры
    * и также вывести его на экран*/
    public static void main(String[] args) {
        String old = "Жизнь хороша";
        System.out.println(old);
        Scanner scannerOne = new Scanner(System.in);
        System.out.println("Введите новое значение строки");
       old = scannerOne.next();
        System.out.println(old);
    }
}
