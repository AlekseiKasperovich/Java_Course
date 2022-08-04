package com.epam.part2;

public class Task2 {
    public static void main(String[] args) {
        //2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
        int[][] matrix = {
                {1, 3, 4, 6, 5},
                {9, 1, 5, 5, 4},
                {8, 2, 1, 4, 3},
                {8, 2, 6, 1, 2},
                {8, 2, 6, 1, 1}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
