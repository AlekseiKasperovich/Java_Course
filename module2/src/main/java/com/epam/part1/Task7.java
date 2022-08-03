package com.epam.part1;

public class Task7 {
    public static void main(String[] args) {
        //7. Даны действительные числа a 1 , a 2 , ... , a n . Найти
        //max( a 1 + a 2 n , a 2 + a 2 n − 1 , ... , a n + a n + 1 ).
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int max = arr[0] + arr[arr.length - 1];
        for (int i = 1; i < arr.length / 2; i++) {
            int a = (arr[i] + arr[arr.length - i - 1]);
            if (a > max) {
                max = a;
            }
        }
        System.out.println("max = " + max);
    }
}
