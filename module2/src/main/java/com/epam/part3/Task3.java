package com.epam.part3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //3. Сортировка выбором. Дана последовательность чисел ..... .Требуется переставить элементы так,
        //чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
        //элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
        //повторяется. Написать алгоритм сортировки выбором.
        int[] arr = new int[]{12, 13, 14, 15, 16, 17};
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            int max = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                    max = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = max;
            arr[maxIndex] = temp;
        }
        System.out.println("Массив после сортировки выбором = " + Arrays.toString(arr));
    }
}