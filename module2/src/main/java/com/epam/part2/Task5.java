package com.epam.part2;

import com.epam.App;

public class Task5 {
    public static void main(String[] args) {
        //5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int n = 8;
        int marks[][] = new int[n][n];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (j < marks.length - i) {
                    marks[i][j] = i + 1;
                } else {
                    marks[i][j] = 0;
                }
            }
        }
        App.printMatrix(marks);
    }
}
