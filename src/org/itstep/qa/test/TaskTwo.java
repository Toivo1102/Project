package org.itstep.qa.test;

import java.util.Random;
import java.util.Scanner;

public class TaskTwo {

    /*
    Составить программу, которая проверяет знание
    таблицы умножения и сообщает пользователю результат (верно или нет).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        for (int i = 1; i< 10; i++){
            for (int j = 1; j < 10; j++) {
                System.out.println("Введите результат " +
                        "произведения чисел " + i + " и " + j);
                result = scanner.nextInt();
                if (result == i*j) {
                    System.out.println("Угадали");
                } else {
                    System.out.println("Не угадали");
                }
            }

        }
      /*  Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber;
        randomNumber = random.nextInt(10);
        int five = 5;
        int result;
        System.out.println("Давайте проверим знание таблицы умножения на цифру 5: "
                + five + " * " + randomNumber + " =");
        System.out.println("Введите правильный ответ");
        int correctAnswer;

        if (randomNumber == 0) {
            result = five * 0;
        } else {
            if (randomNumber == 1) {
                result = five * 1;
            } else {
                if (randomNumber == 2) {
                    result = five * 2;
                } else {
                    if (randomNumber == 3) {
                        result = five * 3;
                    } else {
                        if (randomNumber == 4) {
                            result = five * 4;
                        } else {
                            if (randomNumber == 5) {
                                result = five * 5;
                            } else {
                                if (randomNumber == 6) {
                                    result = five * 6;
                                } else {
                                    if (randomNumber == 7) {
                                        result = five * 7;
                                    } else {
                                        if (randomNumber == 8) {
                                            result = five * 8;
                                        } else {
                                            result = five * 9;
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }

        int i = 0;
        while (i < 6) {
            i++;
            correctAnswer = scanner.nextInt();
            if (correctAnswer == result && i < 5) {
                System.out.println("Вы хорошо знаете таблицу умножения!!!");
                break;
            } else {
                if (i < 5) {
                    System.out.println(" Попробуйте еще раз");
                } else {
                    System.out.println("Количество попыток " +
                            "ввода правильного ответа закончилось(((");
                }
            }
        }
*/
    }

}
