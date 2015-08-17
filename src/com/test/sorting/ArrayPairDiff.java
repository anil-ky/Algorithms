package com.test.sorting;

import java.util.Arrays;

public class ArrayPairDiff {

	public static void main(String[] args) {
		int n = 4;
		int l = 0;
		int r = 0;
		int count = 0;
		int k = 4;
		int a[] = {7,623,19,10,11,9,3,15};
		
		Arrays.sort(a);
		
		while (r < n) {
			if (a[r] - a[l] == k) {
				System.out.println("Numbers = " + a[r] + " - " + a[l]);
				count++;
				l++;
				r++;
			} else if (a[r] - a[l] > k)
				l++;
			else
				r++;
		}
		
		System.out.println(count);

	}

}
