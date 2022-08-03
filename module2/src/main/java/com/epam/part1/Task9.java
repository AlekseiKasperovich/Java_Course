package com.epam.part1;

public class Task9 {
    public static void main(String[] args) {
        //9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
        //чисел несколько, то определить наименьшее из них.
        int arr[] = new int[]{1, 2, 1, 4, 2, 6, 1, 8, 2, 2, 1};
        int repeat = 0;
        int val = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if ((count > repeat) || (count == repeat && arr[i] < val)) {
                repeat = count;
                val = arr[i];
            }
        }
        System.out.println("Наименьшее число = " + val + ", повторяется: " + repeat);
    }
}
