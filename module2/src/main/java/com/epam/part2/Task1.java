package com.epam.part2;

public class Task1 {
    public static void main(String[] args) {
        //1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
        int[][] matrix = {
                {10, 3, 4, 6, 13},
                {9, 2, 5, 5, 12},
                {8, 1, 6, 1, 11}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[0][j] > matrix[matrix.length - 1][j] && j % 2 != 0) {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
