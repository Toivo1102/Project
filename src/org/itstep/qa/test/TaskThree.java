package org.itstep.qa.test;

import java.util.Scanner;

public class TaskThree {
    /*
  Пользователь вводит с клавиатуры название
  валюты, программа выводит на экран текущий курс (курс можно просто нафантазировать)
   */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currency;
        System.out.println("Введите любое из 5 наименования валюты (usd), евро (eur), " +
                "канадский доллар (cad), фунт стерлингов (gbp), швейцарский франк (chf) ");
        currency = scanner.next();
        switch (currency) {
            case "usd": {
                System.out.println("Курс НБРБ на 17.09.2018 составляет: 2,1387");
                break;
            }
            case "eur": {
                System.out.println("Курс НБРБ на 17.09.2018 составляет: 2,4996");
                break;
            }
            case "cad": {
                System.out.println("Курс НБРБ на 17.09.2018 составляет: 1,6451");
                break;
            }
            case "gbp": {
                System.out.println("Курс НБРБ на 17.09.2018 составляет: 2,8066");
                break;
            }
            case "chf": {
                System.out.println("Курс НБРБ на 17.09.2018 составляет: 2,2180");
                break;
            }

            default: {
                System.out.println("Информации по курсу этой валюты нет");
            }
        }
    }
}
