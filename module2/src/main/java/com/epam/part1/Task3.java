package com.epam.part1;

public class Task3 {
    public static void main(String[] args) {
        //3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
        //положительных и нулевых элементов.
        double arr[] = new double[]{1, 4, -3, 1.5, 0, 6, -42, 8};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (double i : arr) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Положительных элементов = " + positive);
        System.out.println("Отрицательных элементов = " + negative);
        System.out.println("Нулевых элементов = " + zero);
    }
}
