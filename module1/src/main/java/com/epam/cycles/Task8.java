package com.epam.cycles;

import com.epam.App;

import java.util.HashSet;
import java.util.Set;

public class Task8 {
    public static void main(String[] args) {
        //8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
        String str1 = String.valueOf(App.scannerInt("x"));
        System.out.println("num1 = " + str1);
        String str2 = String.valueOf(App.scannerInt("y"));
        System.out.println("num2 = " + str2);
        char[] num1 = str1.toCharArray();
        char[] num2 = str2.toCharArray();
        Set<Character> set=new HashSet<>();
        System.out.println("Цифры, входящие в запись как первого так и второго числа: ");
        for (char a : num1) {
            for (char b : num2) {
                if (a == b) {
                    set.add(a);
                    break;
                }
            }
        }
        System.out.println(set);
    }
}
