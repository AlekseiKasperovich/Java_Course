package com.epam.part1;

public class Task6 {
    public static void main(String[] args) {
        //6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
        //являются простыми числами.
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        int sum = 0;
        for (int i = 2; i < arr.length; i++) {
            if (i == 2 || i == 3) {
                sum += arr[i];
            }
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                } else {
                    j = 3;
                    if (i % j == 0) {
                        break;
                    }
                    j = 5;
                    if (i % j == 0 && i != 5) {
                        break;
                    }
                    j = 7;
                    if (i % j == 0 && i != 7) {
                        break;
                    }
                    sum += arr[i];
                    break;
                }
            }
        }
        System.out.println("Сумма чисел, порядковые номера которых являются простыми числами = " + sum);
    }
}
