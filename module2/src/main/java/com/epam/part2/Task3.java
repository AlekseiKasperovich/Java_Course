package com.epam.part2;

public class Task3 {
    public static void main(String[] args) {
        //3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
        int[][] matrix = {
                {1, 3, 4, 6, 1},
                {9, 2, 5, 5, 1},
                {8, 1, 6, 1, 1}
        };
        int k = 3;
        int p = 4;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == (k - 1) || j == (p - 1)) {
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
