package com.epam.part2;

public class Task7 {
    public static void main(String[] args) {
        //7. Сформировать квадратную матрицу порядка N по правилу:
        //и подсчитать количество положительных элементов в ней.
        int n = 10;
        double marks[][] = new double[n][n];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = Math.sin((i * i - j * j) / marks.length);
            }
        }
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] > 0) {
                    count++;
                }
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов = " + count);
    }
}
