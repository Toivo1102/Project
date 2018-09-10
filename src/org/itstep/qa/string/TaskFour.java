package org.itstep.qa.string;

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
                while (Character.isWhitespace(wordArray[i]))
                {
                    word = word + 1;
                    break;
                }


            }
            System.out.println("Строка содержит " + word + " слов(-а)");
        }

}
