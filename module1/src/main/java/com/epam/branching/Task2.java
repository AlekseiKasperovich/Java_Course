package com.epam.branching;

import com.epam.App;

public class Task2 {
    public static void main(String[] args) {
        //2. Найти max{min(a, b), min(c, d)}.
        int a = App.scannerInt("a");
        System.out.println("a = " + a);
        int b = App.scannerInt("b");
        System.out.println("b = " + b);
        int c = App.scannerInt("c");
        System.out.println("c = " + c);
        int d = App.scannerInt("d");
        System.out.println("d = " + d);
        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        int max = Math.max(min1, min2);
        System.out.println("result = " + max);
    }
}
