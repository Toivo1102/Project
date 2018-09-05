package org.itstep.qa.cyclesTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*Составьте программу для ввода с консоли имени и возраста человека
    и вывода на консоль строки вида: "Ваше имя Имя,  Вам лет NN лет"
     */
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Введите имя и возраст");
        name = scanner.next();
        age = scanner.nextInt();
        System.out.println("Ваше имя " + name + " Вам " + age + " лет");

    }
}
