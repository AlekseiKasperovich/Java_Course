package com.epam.part2;

import com.epam.App;

public class Task16 {
    public static void main(String[] args) {
        //16. Магическим квадратом порядка n называется квадратная матрица размера n x n, составленная из чисел 1, 2, 3,
        //..., n 2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
        //собой. Построить такой квадрат.
        int n = 4;
        int matrix[][] = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i + j + 1 + (matrix.length - 1) * i;
            }
        }
        int[][] tempMatrix = new int[n][n];
        int count = 0;
        for (int i = 0; i < tempMatrix.length; i++) {
            for (int j = 0; j < tempMatrix[i].length; j++) {
                tempMatrix[i][j] = tempMatrix.length * tempMatrix.length - count;
                count++;
            }
        }
        int size = 4;
        int x = 0;
        int y = 0;
        for (int i = 0; i < (n * n / 16); i++) {
            if (x == (int) Math.sqrt(n * n / 16)) {
                x = 0;
                y++;
            }
            for (int j = 0; j < 4; j++) {
                matrix[size * y + j][size * x + j] = tempMatrix[size * y + j][size * x + j];
                matrix[size * y + j][size * x + size - 1 - j] = tempMatrix[size * y + j][size * x + size - 1 - j];
            }
            x++;
        }
        System.out.println("Магический квадрат порядка n, где n кратно 4: ");
        App.printMatrix(matrix);
    }
}
