package com.epam.part1;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        //10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
        //элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
        int arr[] = new int[]{1, 2, 1, 4, 1, 6, 1, 8, 1, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println("Новый массив = " + Arrays.toString(arr));
    }
}
