package com.test.line;

/*calc(n, 1); // this tree will appear n times
 calc(n, 2); // this tree will appear n times
 calc(n, 3) // this tree will appear n times
 .
 .
 calc(n, n+1) // this call will appear n times
 */
// count = n^0 + n^1 + n^2 + ... + n^n + n^(n+1)

public class Calculator {
	public int count = 0;

	public void calc(int n, int p) {
		count++;
		if (p > n)
			return;
		for (int i = 0; i < n; i++) {
			calc(n, p + 1);
		}
	}

	public static void main(String[] args) {
		// int n is input from the Keyboard

		for (int i = 1; i <= 5; i++) {
			Calculator c = new Calculator();
			c.calc(i, 0);
			System.out.println(i + " - " + c.count);
		}
	}
}
