package com.epam;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

    }

    public static int scannerInt(String s) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Введите целое число " + s + ": ");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Некорректный ввод!");
            System.out.print("Введите целое число " + s + ": ");
        }
        num = scan.nextInt();
        return num;
    }
}
