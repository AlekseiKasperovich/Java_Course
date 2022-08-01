package com.epam.branching;

public class Task5 {
    public static void main(String[] args) {
        //5. Вычислить значение функции:
        double res;
        double x = 1;
        if (x <= 3) {
            res = Math.pow(x, 2) - 3 * x + 9;
        } else {
            res = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("result = " + res);
    }
}
