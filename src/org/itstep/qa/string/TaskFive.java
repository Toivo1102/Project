package org.itstep.qa.string;

public class TaskFive {
    public static void main(String[] args) {
        /*
        Изменить регистр введенного символа, если он был латинской буквой.
         */
        char letter = ':';
        if (Character.isLetter(letter)) {

            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                if (Character.isLowerCase(letter)) {
                    System.out.println(Character.toUpperCase(letter));
                } else {
                     System.out.println(Character.toLowerCase(letter));
                }

            } else System.out.println("Значение не является латинской буквой");

        } else System.out.println("Значение не является буквой");

    }

}
