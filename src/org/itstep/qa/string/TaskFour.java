package org.itstep.qa.string;

import java.util.Arrays;

public class TaskFour {
    public static void main (String [] args) {
        /*
        Дана строка, содержащая пробелы. Найдите, сколько в ней слов
        (слово – это последовательность символов, отличных от пробела).
        Все слова разделены одним пробелом.
         */
        String myString = " Мама мыла раму ";

        myString = myString.trim();  //  метод trim  удаляет пробелы с обоих концов строки
        System.out.println(myString);
        char[] wordArray = myString.toCharArray();
        int word = 1;
        for (int i = 0; i < wordArray.length; i++) {
            while (Character.isWhitespace(wordArray[i])) {
                word = word + 1;
                break;
            }


        }
        System.out.println("Строка содержит " + word + " слов(-а)");


        String testLine = "Мама  мыла раму ";
        String[] result = testLine.split(" ");
        System.out.println(Arrays.toString(result));
        System.out.println("Количество слов равно " + result.length);  // пропускает второй пробел
        int counter = 0;
        for (int i = 0; i < result.length; i++) {
            if (!result[i].isEmpty()) {
                counter ++;
            }
        }
        System.out.println("Количество слов равно " + counter);
        int counterTwo = 0;
         for(String tempValue : result) {   // цикл фореч  заводится промежуточная переменная, которой
            if (!tempValue.isEmpty()) {   // присвается последовательно каждое значение переменной result
                counterTwo ++;
            }
         }

        System.out.println("Количество слов равно " + counterTwo);

        String test = "Мама  мыла     раму ";
        String[] res = test.split(" +");  // регулярное выражение + удаляет два и более пробелов
        System.out.println(Arrays.toString(res));
        System.out.println("Количество слов равно " + res.length);
    }
}
