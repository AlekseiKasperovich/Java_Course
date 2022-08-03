package com.epam.part1;

public class Task5 {
    public static void main(String[] args) {
        //5. Даны целые числа а 1 ,а 2 ,..., а n . Вывести на печать только те числа, для которых а i > i.
        int arr[] = new int[]{1, 4, -3, -42, 0, 6, 5, 8};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
