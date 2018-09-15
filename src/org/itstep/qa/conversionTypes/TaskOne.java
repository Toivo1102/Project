package org.itstep.qa.conversionTypes;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        /*
        Пользователь вводит название месяца
        (все слово в нижнем регистре). Вывести количество дней этого месяца
         */
        Scanner scanner = new Scanner(System.in);
        String month;
        System.out.println("Введите месяц");
        month = scanner.next();
        switch (month) {      // можно использовать только int byte string
            case "февраль": {   // в строках необходимо соблюдать регистр
                System.out.println("Количесвто дней в месяце - 28");
                break;
            }
            case "март": {
            }
            case "май": {
            }
            case "июль": {
            }
            case "август": {
            }
            case "октябрь": {
            }
            case "январь" : {
            }
            case "декабрь": {
                System.out.println("Количесвто дней в месяце - 31");
                break;
            }
            case "апрель": {
            }
            case "июнь": {
            }
            case "сентябрь": {
            }

            case "ноябрь": {
                System.out.println("Количесвто дней в месяце - 30");
                break;
            }
            default: {
                System.out.println("Это вообще не месяц");
            }
        }
    }
}
