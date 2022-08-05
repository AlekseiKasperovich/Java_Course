package com.epam.part2;

import com.epam.App;

public class Task15 {
    public static void main(String[] args) {
        //15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
        int[][] matrix = {
                {1, 3, 4, 6, 5},
                {9, 1, 5, 5, 4},
                {8, 2, 1, 4, 3},
                {8, 2, 6, 1, 2},
                {8, 2, 6, 1, 1}
        };
        App.printMatrix(matrix);
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }
        System.out.println("Матрица после замены нечетных элементов: ");
        App.printMatrix(matrix);
    }
}