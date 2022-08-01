package com.epam.cycles;

public class Task2 {
    public static void main(String[] args) {
        //2. Вычислить значения функции на отрезке [а,b] c шагом h:
        int a = -5;
        int b = 10;
        int h = 1;
        int x;
        int y;
        for (x = a; x <= b; x += h) {
            System.out.print("x= " + x);
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println(" result= " + y);
        }
    }
}
