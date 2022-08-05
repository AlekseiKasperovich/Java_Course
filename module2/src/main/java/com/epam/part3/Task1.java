package com.epam.part3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
        //один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
        //дополнительный массив.
        int k = 3;
        int count = 0;
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{7, 8, 9, 0};
        int[] res = new int[(arr1.length + arr2.length)];
        for (int i = 0; i < res.length; i++) {
            if (k > i) {
                res[i] = arr1[i];
            } else if (count < arr2.length) {
                res[i] = arr2[count];
                count++;
            } else
                res[i] = arr1[i - k - 1];
        }
        System.out.println("Новый массив = " + Arrays.toString(res));
    }
}
