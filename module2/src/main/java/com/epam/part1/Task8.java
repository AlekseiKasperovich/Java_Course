package com.epam.part1;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        //8. Дана последовательность целых чисел a 1 , a 2 , ... , a n. Образовать новую последовательность, выбросив из
        //исходной те члены, которые равны min( a 1 , a 2 , ... , a n ).
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int count = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        for (int val : arr) {
            if (val == min) {
                count++;
            }
        }
        int res[] = new int[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                res[index] = arr[i];
                index++;
            }
        }
        System.out.println("Новая последовательность = " + Arrays.toString(res));
    }
}
