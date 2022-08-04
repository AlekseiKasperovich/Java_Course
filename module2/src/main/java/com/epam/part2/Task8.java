package com.epam.part2;

import com.epam.App;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
        //на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
        //пользователь с клавиатуры.
        int[][] marks = {
                {1, 3, 4, 6, 5},
                {9, 1, 5, 5, 4},
                {8, 2, 1, 4, 3},
                {8, 2, 6, 1, 2},
                {8, 2, 6, 1, 1}
        };
        System.out.println("Матрица до перестановки: ");
        App.printMatrix(marks);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите индекс первого столбца: ");
        int num1 = in.nextInt();
        System.out.println("Введите индекс второго столбца: ");
        int num2 = in.nextInt();
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (j == num1) {
                    int temp = 0;
                    temp = marks[i][j];
                    marks[i][j] = marks[i][num2];
                    marks[i][num2] = temp;
                }
            }
        }
        System.out.println("Матрица после перестановки: ");
        App.printMatrix(marks);
    }
}
