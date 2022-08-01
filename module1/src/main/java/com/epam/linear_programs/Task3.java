package com.epam.linear_programs;

public class Task3 {
    public static void main(String[] args) {
        //3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        double z;
        double x = 2.3;
        double y = -5.6;
        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("result = " + z);
    }
}
