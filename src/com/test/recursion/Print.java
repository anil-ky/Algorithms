package com.test.recursion;

public class Print {
	
	public static void main(String[] args) {
		display(10);
	}
	
	private static int display(int number) {

		if (number == 0) {
			System.out.println("Its Over...");
		} else {
			System.out.println(number);
			display(--number);
		}

		return number;
	}

}
