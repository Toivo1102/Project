package org.itstep.qa.test;

public class TaskSix {
    public static void main(String[] args) {
        /*
       Заданы моменты начала и конца некоторого промежутка времени в часах,
       минутах и секундах (в пределах одних суток). Найти продолжительность этого
       промежутка в тех же единицах измерения.
Пример вывода:
Начало  10:30:45
Конец    13:20:15
Продолжительность     2:49:30

         */

        String start = "24:56:45";
        String finish = "16:14:16";
        String[] arrStart = start.split(":");
        String[] arrFinish = finish.split(":");
        int[] arrResult = new int[arrStart.length];
        int startTemp, finishTemp;

        for (int i = 0; i < arrStart.length; i++) {
            startTemp = Integer.parseInt(arrStart[i]);
            finishTemp = Integer.parseInt(arrFinish[i]);
            if (finishTemp - startTemp >= 0) {
                arrResult[i] = finishTemp - startTemp;
            } else {
                if (i != 0) {
                    arrResult[i] = finishTemp + 60 - startTemp;
                } else {
                    arrResult[i] = finishTemp + 24 - startTemp;
                }
            }
        }

        System.out.println("Результат: " + arrResult[0] +
                ":" + arrResult[1] + ":" + arrResult[2]);
    }
}
