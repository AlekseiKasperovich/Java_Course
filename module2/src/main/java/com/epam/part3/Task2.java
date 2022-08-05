package com.epam.part3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //2. Даны две последовательности ..... . Образовать из них новую последовательность
        //чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
        int[] arr1 = new int[]{12, 13, 14, 15, 16, 17};
        int[] arr2 = new int[]{20, 21, 22};
        int[] res;
        if (arr1[arr1.length - 1] < arr2[0]) {
            res = Task2.workWithArray(arr1, arr2);
        } else {
            res = Task2.workWithArray(arr2, arr1);
        }
        System.out.println("Новый массив = " + Arrays.toString(res));
    }

    private static int[] workWithArray(int[] arr1, int[] arr2) {
        int count = 0;
        int[] res = new int[(arr1.length + arr2.length)];
        for (int j = 0; j < arr1.length; j++) {
            res[j] = arr1[j];
            count++;
        }
        for (int k = 0; k < arr2.length; k++) {
            res[count] = arr2[k];
            count++;
        }
        return res;
    }
}