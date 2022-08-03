package com.epam.part1;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        //4. Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.
        double arr[] = new double[]{1, 4, -3, -42, 0, 6, 1.5, 8};
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        double temp = arr[max];
        arr[max] = arr[min];
        arr[min] = temp;
        System.out.println("Массив после перестановки = " + Arrays.toString(arr));
    }
}
