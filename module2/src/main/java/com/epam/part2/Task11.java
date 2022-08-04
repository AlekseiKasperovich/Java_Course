package com.epam.part2;

import com.epam.App;

public class Task11 {
    public static void main(String[] args) {
        //11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
        //которых число 5 встречается три и более раз.
        int a = 10;
        int b = 20;
        int max = 15;
        int x = 5;
        int y = 3;
        int marks[][] = new int[a][b];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = (int) (Math.random() * max) + 1;
            }
        }
        App.printMatrix(marks);
        System.out.print("Индекс строк, в которых число 5 встречается три и более раз: ");
        for (int i = 0; i < marks.length; i++) {
            int count = 0;
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] == x) {
                    count++;
                }
            }
            if (count >= y) {
                System.out.print(i + ", ");
            }
        }
    }
}
