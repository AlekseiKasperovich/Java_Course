package com.epam.part2;

import com.epam.App;

public class Task14 {
    public static void main(String[] args) {
        //14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
        //единиц равно номеру столбца.
        int n = 10;
        int m = 10;
        int[][] marks = new int[n][m];
        for (int i = 0; i < marks[0].length; i++) {
            for (int j = 0; j < i; j++) {
                marks[j][i] = 1;
            }
        }
        App.printMatrix(marks);
    }
}
