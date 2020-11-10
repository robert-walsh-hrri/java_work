package com.company;

import java.util.ArrayList;

public class HeapAlgo {
    public static ArrayList<int[]> resultArray = new ArrayList<>();

    public static void printArr(int a[], int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println();
    }

    public static void heapPermutation(int a[], int size, int n) {

        if (size == 1) {
            printArr(a, n);
            resultArray.add(a);
        }

        for (int i = 0; i < size; i++) {
            heapPermutation(a, size - 1, n);
            if (size % 2 == 1) {
                int temp = a[0];
                a[0] = a[size - 1];
                a[size - 1] = temp;
            } else {
                int temp = a[i];
                a[i] = a[size -1];
                a[size - 1] = temp;
            }
        }

    }



    public static void main(String[] args) {

        HeapAlgo obj = new HeapAlgo();
        int a[] = {1, 2, 3};
        obj.heapPermutation(a, a.length, a.length);
        for (int i = 0; i < resultArray.size(); i++) {
            printArr(resultArray.get(i), resultArray.get(i).length);
        }
    }
}
