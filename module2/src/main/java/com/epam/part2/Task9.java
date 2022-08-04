package com.epam.part2;

public class Task9 {
    public static void main(String[] args) {
        //9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
        //столбец содержит максимальную сумму.
        int[][] marks = {
                {1, 2, 5, 4, 1},
                {1, 2, 5, 4, 1},
                {1, 2, 5, 4, 1},
                {1, 2, 5, 4, 1},
                {1, 2, 5, 4, 1}
        };
        int sum = 0;
        int index = 0;
        for (int i = 0; i < marks[0].length; i++) {
            int count = 0;
            for (int j = 0; j < marks.length; j++) {
                count += marks[j][i];
            }
            if (count > sum) {
                sum = count;
                index = i;
            }
        }
        System.out.println("Максимальная сумма элементов = " + sum + ", в столбце с индексом = " + index);
    }
}
