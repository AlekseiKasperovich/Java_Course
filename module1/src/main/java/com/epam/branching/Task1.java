package com.epam.branching;

import com.epam.App;

public class Task1 {
    public static void main(String[] args) {
        //1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
        //он прямоугольным.
        int a = App.scannerInt("a");
        System.out.println("a = " + a);
        int b = App.scannerInt("b");
        System.out.println("b = " + b);
        if (a + b < 180) {
            if (a < 0 || b < 0) {
                System.out.println("Такой треугольник не существует");
            } else if (a == 90 || b == 90 || (a+b) == 90) {
                System.out.println("Прямоугольный треугольник");
            } else {
                System.out.println("Такой треугольник существует");
            }
        } else {
            System.out.println("Такой треугольник не существует");
        }
    }
}
