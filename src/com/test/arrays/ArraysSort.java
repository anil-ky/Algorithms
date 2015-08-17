package com.test.arrays;

public class ArraysSort {

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 6, 7, 9 };
		int b[] = { 2, 4, 6, 8, 10 };

		int[] answer = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		/*
		 * while (i < a.length && j < b.length) { if (a[i] < b[j]) { answer[k] =
		 * a[i]; i++; } else { answer[k] = b[j]; j++; } k++; }
		 */

		/*
		 * while (i < a.length) { answer[k++] = a[i++]; }
		 * 
		 * while (j < b.length) { answer[k++] = b[j++]; }
		 */

		while (i < a.length && j < b.length) {
			answer[k++] = a[i] < b[j] ? a[i++] : b[j++];
		}

		System.arraycopy(a, i, answer, k, (a.length - i));
		System.arraycopy(b, j, answer, k, (b.length - j));

		for (int index = 0; index < answer.length; index++) {
			System.out.print(answer[index] + " ");
		}
	}

}
