package com.epam.cycles;

public class Task5 {
    public static void main(String[] args) {
        //5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
        //заданному е. Общий член ряда имеет вид:
        int n = 1;
        double e = 0.000001;
        double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
        double sum = 0;
        while (Math.abs(a) >= e) {
            sum += a;
            n++;
            a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
        }
        System.out.println("Сумма = " + sum);
    }
}
