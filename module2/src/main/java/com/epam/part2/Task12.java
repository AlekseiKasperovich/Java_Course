package com.epam.part2;

import com.epam.App;

public class Task12 {
    public static void main(String[] args) {
        //12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
        int[][] matrix = {
                {1, 3, 4, 6, 5},
                {9, -1, 5, 5, 4},
                {8, 2, 1, 4, 3},
                {8, 2, 6, -1, 2},
                {8, 2, 6, 1, 1}
        };
        App.printMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        int tmp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = tmp;
                    }
                }
            }
        }
        System.out.println("Матрица после сортировки значений в строках по возрастанию: ");
        App.printMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (matrix[i][k] < matrix[i][k + 1]) {
                        int tmp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = tmp;
                    }
                }
            }
        }
        System.out.println("Матрица после сортировки значений в строках по убыванию: ");
        App.printMatrix(matrix);
    }
}
