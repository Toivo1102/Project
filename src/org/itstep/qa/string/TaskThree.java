package org.itstep.qa.string;

public class TaskThree {
    public static void main(String[] args) {
    /*
    Даны две строки. Определите, является ли первая строка подстрокой второй строки.
    Можно использовать метод contains).

     */
    String first = "Мама мыла";
    String second = "Мама мыла раму";
        if (second.contains(first))
        {
            System.out.println("Первая строка является подстрокой второй строки");
        }
        else {
            System.out.println("Первая строка не является подстрокой второй строки");
        }

    }
}
