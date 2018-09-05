package org.itstep.qa.cyclesTwo;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    /*
     * Задать случайное число от 0 до 20. У пользователя пять попыток на угадывание.
     * При каждой попытке выводить сообщение - "Мало" или "Много".
     * Если угадано за 5 попыток - вывести "Победа", в противном случае - "Проигрыш"*/
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(20);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 20");
        int i = 0;
            while (i < 6) {
                i++;
                int inputValue = scanner.nextInt();
                if (inputValue == r && i < 5) {

                    System.out.println("Победа");
                    break;
                } else {
                    if (inputValue < r && i < 5) {

                        System.out.println("Мало");

                    } else if (inputValue > r && i < 5) {

                        System.out.println("Много");

                    } else System.out.println("Проигрыш");


                }


            }

    }
}
