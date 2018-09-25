package org.itstep.qa.classesAndObjects;

public class RunnerCircle {
    public static void main (String [] args) {
        Circle circle = new Circle();
        System.out.println("Было: " + circle.getRadius());
        circle.setRadius(12);
        System.out.println("Стало "  + circle.getRadius());
        System.out.println("Площадь: " + circle.getSquare());
    }
}
