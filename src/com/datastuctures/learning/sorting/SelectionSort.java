package com.datastuctures.learning.sorting;

import java.util.Arrays;

/**
 * Sample queue implementation.
 *
 * @author anil kumar
 * @since 11.10.21
 */
public class SelectionSort {

    private static int listToSort[] = new int[]{4, 5, 6, 2, 1, 7, 10, 3, 8, 9};

    public static void main(String[] args) {
        print(listToSort);
        selectionSort(listToSort);
    }

    public static void print(int[] listToSort) {
        Arrays.stream(listToSort).forEach(i-> System.out.print(i + ", "));
        System.out.println();
    }

    public static void selectionSort(int[] listToSort) {
        for (int i = 0; i < listToSort.length; i++) {
            for (int j = i + 1; j < listToSort.length; j++) {
                if (listToSort[i] > listToSort[j]) {
                    swap(listToSort, i, j);
                }
            }
            print(listToSort);
        }
    }

    public static void swap(int[] listToSort, int iIndex, int jIndex) {
        int temp = listToSort[iIndex];
        listToSort[iIndex] = listToSort[jIndex];
        listToSort[jIndex] = temp;
    }
}
