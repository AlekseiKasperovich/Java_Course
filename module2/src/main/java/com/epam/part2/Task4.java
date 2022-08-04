package com.epam.part2;

import com.epam.App;

public class Task4 {
    public static void main(String[] args) {
        //4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int n = 8;
        int marks[][] = new int[n][n];
        for (int i = 0; i < marks.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < marks[i].length; j++) {
                    marks[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < marks[i].length; j++) {
                    marks[i][j] = n - j;
                }
            }
        }
        App.printMatrix(marks);
    }
}
