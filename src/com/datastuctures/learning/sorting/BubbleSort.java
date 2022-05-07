package com.datastuctures.learning.sorting;

/**
 * Sample queue implementation.
 *
 * @author anil kumar
 * @since 10.10.21
 */
public class BubbleSort {

    private static int listToSort[] = new int[]{3, 5, 6, 8, 10, 1, 2, 4, 7, 9};

    public static void main(String[] args) {
        print(listToSort);
        bubbleSort(listToSort);
    }

    public static void bubbleSort(int[] listToSort) {
        for (int i = 0; i < listToSort.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < listToSort.length - i - 1; j++) {
                if (listToSort[j] > listToSort[j + 1]) {
                    swap(listToSort, j, j + 1);
                    swapped = true;
                }
            }
            print(listToSort);
            if (!swapped) { // means list is already sorted and no need to sort again.

                System.out.println(String.format("list is sorted at %d position ", i));
                break;
            }
        }
    }

    public static void print(int[] listToSort) {
        for (int el : listToSort) {
            System.out.print(el + ",");
        }
        System.out.println();
    }

    public static void swap(int[] listToSort, int iIndex, int jIndex) {
        int temp = listToSort[iIndex];
        listToSort[iIndex] = listToSort[jIndex];
        listToSort[jIndex] = temp;
    }
}
