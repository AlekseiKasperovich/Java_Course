package com.epam.linear_programs;

public class Task2 {
    public static void main(String[] args) {
        //2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        double z;
        double a = 2.3;
        double b = -5.6;
        double c = 1.8;
        z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
        System.out.println("result = " + z);
    }


}
