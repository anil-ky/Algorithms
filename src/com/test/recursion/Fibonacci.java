package com.test.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fact(5));
	}

	private static int fact(int number) {

		int value = 1;

		if (number == 1) {
			return 1;
		} else {
			value = number * fact(number - 1);
		}

		return value;
	}

}
