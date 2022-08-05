package com.epam.part3;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        //4. Сортировка обменами. Дана последовательность чисел .... .Требуется переставить числа в
        //порядке возрастания. Для этого сравниваются два соседних числа a i и a i + 1 . Если a i  a i + 1 , то делается
        //перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
        //Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
        int[] arr = new int[]{17, 16, 15, 14, 13, 12};
        int count = 0;
        for (int i = arr.length - 1; i >= 1; i--) {
            int temp;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println("Массив после сортировки обменом = " + Arrays.toString(arr) + " Количество перестановок = " + count);
    }
}
