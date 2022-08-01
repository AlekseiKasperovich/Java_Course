package com.epam.cycles;

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        //4. Составить программу нахождения произведения квадратов первых двухсот чисел.
        BigInteger multiplication = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            multiplication = multiplication.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println("Произведение = " + multiplication);
    }
}
