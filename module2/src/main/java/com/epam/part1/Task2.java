package com.epam.part1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //2. Дана последовательность действительных чисел а 1 ,а 2 ,..., а п . Заменить все ее члены, большие данного Z, этим
        //числом. Подсчитать количество замен.
        double arr[] = new double[]{-2, -1, 0, 1, 2, 3, 4, 5};
        double z = 3;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                count++;
            }
        }
        System.out.println("Массив после замены элементов = " + Arrays.toString(arr));
        System.out.println("Количество замен = " + count);
    }
}
