package com.test.searching;

public class BinarySearch {

	public static void main(String[] args) {

		int array[] = { 10, 3, 19, 55, 2, 8 };

		System.out.println(binarySearch(array, 2, 6));
	}

	private static int binarySearch(int array[], int data, int size) {
		int low = 0;
		int high = size - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2; // To avoid overflow

			if (array[mid] == data) {
				return mid;
			} else if (array[mid] < data) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}
