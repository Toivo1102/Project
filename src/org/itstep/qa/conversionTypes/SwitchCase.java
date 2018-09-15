package org.itstep.qa.conversionTypes;

public class SwitchCase {
    public static void main(String[] args) {
        String a = "Ноябрь";
        switch (a) {      // можно использовать только int byte string
            case "Январь": {   // в строках необходимо соблюдать регистр
                System.out.println("Это первый месяц");
                break;
            }
            case "Декабрь": {
                System.out.println("Это последний месяц");
                break; // чтобы не выводило весь цикл ниже, а только значение совпадения

            }
            default: {      // должно быть последним
                System.out.println("Совпадений не найдено");
            }
        }

        switch (a) {
            case "Декабрь": {
            }
            case "Январь": {
            }
            case "Февраль": {
                System.out.println(a + " - это зимний месяц");
                break;
            }
            case "Март": {
            }
            case "Апрель": {
            }
            case "Май": {
                System.out.println(a + " - это весенний месяц");
                break;
            }
            case "Июнь": {
            }
            case "Июль": {
            }
            case "Август": {
                System.out.println(a + " - это летний месяц");
                break;
            }
            case "Сентябрь": {
            }
            case "Октябрь": {
            }
            case "Ноябрь": {
                System.out.println(a + " - это осенний месяц");
                break;
            }
            default: {
                System.out.println("Это вообще не месяц");
            }
        }
    }
}
