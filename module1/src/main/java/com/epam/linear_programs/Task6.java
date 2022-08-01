package com.epam.linear_programs;

import com.epam.App;

public class Task6 {
    public static void main(String[] args) {
        //6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
        //принадлежит закрашенной области, и false — в противном случае:
        int x = App.scannerInt("x");
        System.out.println("x = " + x);
        int y = App.scannerInt("y");
        System.out.println("y = " + y);
        if ((x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
