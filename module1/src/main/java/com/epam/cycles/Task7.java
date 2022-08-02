package com.epam.cycles;

import com.epam.App;

public class Task7 {
    public static void main(String[] args) {
        //7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
        //m и n вводятся с клавиатуры.
        long m = -1;
        long n = -1;
        while (m < 0 || n < 0) {
            m = App.scannerInt("m");
            System.out.println("m = " + m);
            n = App.scannerInt("n");
            System.out.println("n = " + n);
        }
        for (long i = m; i <= n; i++) {
            System.out.print("Для числа " + i + " делители, кроме единицы и самого числа = ");
            for (long j = 1; j <= i; j++) {
                if ((i % j) == 0 && (i / j) != 1 && j != 1) {
                    System.out.print(j + ", ");
                }
            }
            System.out.println();
        }
    }
}
