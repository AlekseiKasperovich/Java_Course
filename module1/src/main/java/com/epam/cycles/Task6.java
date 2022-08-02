package com.epam.cycles;

public class Task6 {
    public static void main(String[] args) {
        //6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
        for (int i = 0; i <= 65535; i++) {
            System.out.println(i + " = " + (char) i);
        }
    }
}
