package com.epam.part3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        //5. Сортировка вставками. Дана последовательность чисел a 1 , a 2 ,  , a n . Требуется переставить числа в порядке
        //возрастания. Делается это следующим образом. Пусть a 1 , a 2 ,  , a i - упорядоченная последовательность, т. е.
        //a 1  a 2    a n . Берется следующее число a i + 1 и вставляется в последовательность так, чтобы новая
        //последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
        //не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
        //с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
        int[] arr = new int[]{17, 16, 15, 14, 13, 12};
        int j;
        int selected;
        int loc;
        int low = 0;
        for (int i = 1; i < arr.length; ++i) {
            j = i - 1;
            selected = arr[i];
            loc = Task5.binarySearch(arr, selected, low, j);
            while (j >= loc) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = selected;
        }
        System.out.println("Массив после сортировки вставками = " + Arrays.toString(arr));
    }

    private static int binarySearch(int arr[], int item, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (item == arr[mid]) {
                return mid + 1;
            } else if (item > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
