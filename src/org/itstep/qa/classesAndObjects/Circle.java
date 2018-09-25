package org.itstep.qa.classesAndObjects;

public class Circle {
    public int radius;

    public void setRadius (int radius) {  // задание радиуса
        this.radius = radius;
    }

    public  int getRadius () {   // узнать радиус
        return radius;
    }

    public double getSquare () {
        return Math.PI*radius*radius;  // узнать площадь
    }
}
