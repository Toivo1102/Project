package org.itstep.qa.string;

public class TaskOne {
    /*Проверить является ли введенный символ числом*/
    public static void main(String[] args) {
        char number = '3';
       if (Character.isDigit(number)) System.out.println("Значение является числом");
        else System.out.println("Значение является не числом");
    }
}
