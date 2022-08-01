package com.epam.branching;

public class Task4 {
    public static void main(String[] args) {
        //4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
        //отверстие.
        int a = 251;
        int b = 121;
        int x = 120;
        int y = 65;
        int z = 250;
        if ((x < a && y < b) || (x < b && y < a)) {
            System.out.println("Пройдёт!");
        } else if
        ((x < a && z < b) || (x < b && z < a)) {
            System.out.println("Пройдёт");
        } else if
        ((y < a && z <= b) || (y <= b && z <= a)) {
            System.out.println("Пройдёт");
        } else {
            System.out.println("Не пройдёт!");
        }
    }
}
