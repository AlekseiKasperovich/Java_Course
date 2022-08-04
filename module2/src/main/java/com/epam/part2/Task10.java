package com.epam.part2;

public class Task10 {
    public static void main(String[] args) {
        //10. Найти положительные элементы главной диагонали квадратной матрицы.
        int[][] matrix = {
                {1, 3, 4, 6, 5},
                {9, -1, 5, 5, 4},
                {8, 2, 1, 4, 3},
                {8, 2, 6, -1, 2},
                {8, 2, 6, 1, 1}
        };
        System.out.print("Положительные элементы главной диагонали квадратной матрицы: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] > 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
