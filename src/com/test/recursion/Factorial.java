package com.test.recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(6));
	}

	
	
	private static int fact(int number) {

		int value = 1;

		if (number <= 2) {
			return value;
		} else {
			System.out.println(value);
			return fact(number-2) + fact(number - 1);
		}
	}

}
