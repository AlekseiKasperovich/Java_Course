package com.epam.part1;

public class Task1 {
    public static void main(String[] args) {
        //1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int k = 4;
        int sum = 0;
        for (int i : arr) {
            if (i % k == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма = " + sum);
    }
}
