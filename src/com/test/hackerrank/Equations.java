package com.test.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;


/*
 * Find the number of positive integral solutions for the equations (1/x) + (1/y) = 1/N! (read 1 by N factorial).
 */

public class Equations {

    static boolean isPrime(int p) {
        boolean num = false;
        if (p == 2 || p == 3) {
            return true;
        }
        for (int j = 2; j <= Math.sqrt(p); j++) {
            if (p % j == 0) {
                num = false;
                break;
            } else {
                num = true;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        long mod = 1000007;
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        BigInteger bresult = BigInteger.ONE;
        long x = n;
        for (int i = 2; i <= x; i++) {
            if (isPrime(i)) {
                int k = 1;
                long power = 0;
                while ((Math.pow(i, k) <= x)) {

                    power += n / Math.pow(i, k);

                    k++;
                }
                bresult = bresult.multiply(BigInteger.valueOf(power * 2 + 1));
            }

        }
        System.out.println(bresult.mod(BigInteger.valueOf(mod)));

    }
}
