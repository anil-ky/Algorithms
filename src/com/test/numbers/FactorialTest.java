package com.test.numbers;

public class FactorialTest {

	public static void main(String[] args) {

		System.out.println(factorial(10));
		System.out.println(factorialValue(10));
	}

	public static int factorialValue(int number) {

		int result =1;
		
		for(int i=1; i<=number; i++) {
			result *= i;
		}
		
		return result;
	}

	public static int factorial(int number) {

		if (number == 0) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}

}
