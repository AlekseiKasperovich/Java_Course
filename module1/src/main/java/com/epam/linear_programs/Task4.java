package com.epam.linear_programs;

public class Task4 {
    public static void main(String[] args) {
        //4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
        //дробную и целую части числа и вывести полученное значение числа.
        double res;
        double r = 123.456;
        int first = (int) r;
        int second = (int) ((r - first) * 1000);
        res = second + first * 0.001;
        System.out.println("result = " + res);
    }
}
