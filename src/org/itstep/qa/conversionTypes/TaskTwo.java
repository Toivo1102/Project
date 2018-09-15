package org.itstep.qa.conversionTypes;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data;
        System.out.println("Введите дату");
        data = scanner.nextInt();
        switch (data) {
            case 30: {
                System.out.println("Апрель, июнь, сентябрь, ноябрь");

            }
            case 31: {
                System.out.println("Март, май, июль, август, октябрь, декабрь, январь");
                break;
            }

            default: {
                System.out.println("Во всех месяцах года");
            }
        }
    }
}
