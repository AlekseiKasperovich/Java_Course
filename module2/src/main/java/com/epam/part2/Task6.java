package com.epam.part2;

import com.epam.App;

public class Task6 {
    public static void main(String[] args) {
        //6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
        int n = 10;
        int marks[][] = new int[n][n];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (i < marks.length / 2) {
                    if ((j < i) || (j >= marks.length - i)) {
                        marks[i][j] = 0;
                    } else {
                        marks[i][j] = 1;
                    }
                } else {
                    if ((j < i + 1) && (j >= (marks.length - i - 1))) {
                        marks[i][j] = 1;
                    } else {
                        marks[i][j] = 0;
                    }
                }
            }
        }
        App.printMatrix(marks);
    }
}

