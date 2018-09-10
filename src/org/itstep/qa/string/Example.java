package org.itstep.qa.string;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scannerOne = new Scanner(System.in);
        Scanner scannerTwo = new Scanner(System.in);
        String a = "Привет ";
        String b = "Привет ";
        String y = new String("Привет ");
        String u = new String("ПривЕт ");

        System.out.println(b.charAt(2));  // вывод третьего элемента
        System.out.println(b.length());   // вывод длины строки
        String result = b + a;
        String resultOne = y.concat(u);
        System.out.println(resultOne);
        System.out.println(result);
        System.out.println(scannerOne == scannerTwo);
        System.out.println(b == a);   // если запись через  =, то true
        System.out.println(y == u);    // если запись через new  String  то False
        System.out.println(y.equalsIgnoreCase(u)); // сравнивает содержимое строк, игнорируя регистр

        String str = new String("Добро-пожаловать-сюда");
        String[] resultTwo = str.split("-", 2);
        for (int i = 0; i < resultTwo.length; i++)
            System.out.println(resultTwo[i]);

    }
}
