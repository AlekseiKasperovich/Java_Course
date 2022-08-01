package com.epam.cycles;

import com.epam.App;

public class Task1 {
    public static void main(String[] args) {
        //1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
        //все числа от 1 до введенного пользователем числа.
        int a = App.scannerInt("a");
        System.out.println("a = " + a);
        while (a < 0) {
            a = App.scannerInt("a");
            System.out.println("a = " + a);
        }
        long sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + a + "= " + sum);
    }
}
