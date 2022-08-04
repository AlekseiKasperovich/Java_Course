package com.epam.part2;

import com.epam.App;

public class Task13 {
    public static void main(String[] args) {
        //13. Отсортировать столбцы матрицы по возрастанию и убыванию значений эементов.
        int[][] matrix = {
                {1, 3, 4, 6, 5},
                {9, -1, 5, 5, 4},
                {8, 2, 1, 4, 3},
                {8, 2, 6, -1, 2},
                {8, 2, 6, 1, 1}
        };
        App.printMatrix(matrix);
        for (int i = matrix[0].length - 1; i >= 0; i--) {
            for (int j = matrix.length - 1; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (matrix[k][i] > matrix[k + 1][i]) {
                        int tmp = matrix[k][i];
                        matrix[k][i] = matrix[k + 1][i];
                        matrix[k + 1][i] = tmp;
                    }
                }
            }
        }
        System.out.println("Матрица после сортировки значений в столбцах по возрастанию: ");
        App.printMatrix(matrix);
        for (int i = matrix[0].length - 1; i >= 0; i--) {
            for (int j = matrix.length - 1; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (matrix[k][i] < matrix[k + 1][i]) {
                        int tmp = matrix[k][i];
                        matrix[k][i] = matrix[k + 1][i];
                        matrix[k + 1][i] = tmp;
                    }
                }
            }
        }
        System.out.println("Матрица после сортировки значений в столбцах по убыванию: ");
        App.printMatrix(matrix);
    }
}
