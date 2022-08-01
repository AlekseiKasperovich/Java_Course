package com.epam.linear_programs;

public class Task5 {
    public static void main(String[] args) {
        //5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
        //данное значение длительности в часах, минутах и секундах в следующей форме:
        //ННч ММмин SSc.
        int t = 3661;
        int hours = t / 3600;
        int temp = t - hours * 3600;
        int minutes = temp / 60;
        int seconds = temp - minutes * 60;
        System.out.println(hours + " ч. " + minutes + " мин. " + seconds + " c.");
    }
}
