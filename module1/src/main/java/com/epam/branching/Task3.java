package com.epam.branching;

import com.epam.App;

public class Task3 {
    public static void main(String[] args) {
        //3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
        int x1 = App.scannerInt("x1");
        System.out.println("x1 = " + x1);
        int y1 = App.scannerInt("y1");
        System.out.println("y1 = " + y1);

        int x2 = App.scannerInt("x2");
        System.out.println("x2 = " + x2);
        int y2 = App.scannerInt("y2");
        System.out.println("y2 = " + y2);

        int x3 = App.scannerInt("x3");
        System.out.println("x3 = " + x3);
        int y3 = App.scannerInt("y3");
        System.out.println("y3 = " + y3);

        if ((x1 - x2) * (y2 - y3) == (y1 - y2) * (x2 - x3)) {
            System.out.println("Точки расположены на одной прямой");
        } else {
            System.out.println("Увы, точки расположены не на одной прямой");
        }
    }
}
