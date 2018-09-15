package org.itstep.qa.conversionTypes;

public class Main {
    public static void main (String [] args) {
        int a = 1;
        long b = 3;
        double c = 1.1d;
        char ch = 'a';

        b = a;  // можно присваивать int в long (т.е. большую в меньшую без проблем)
        c = b;  // можно целочисленное в дробное  т.к. коробки одинаковые

       // a = b;  // программа ругается т.к. пытаемся большую коробку запихать в меньшую
      //  b = c;

        a = (int) b;   // если хотим принудительно переложить из большей в меньшую
        b = (long) c;
        a = ch;
        System.out.println(a);

        boolean bb = true;
       // a = (int) bb;  // нельзя присвоить никому, кроме boolean

        String str = "111";
        int strOne = 0;
        strOne = Integer.parseInt(str);  // приведение строки к int

        System.out.println(strOne);

        a = 678;

        str = String.valueOf(a);  //  преобразование числа в строку
        str = Integer.toString(a); //  2-ой способ преобразование числа в строку
        System.out.println(str);
    }
}
