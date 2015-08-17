package com.test.hackerrank;

import java.util.*;

public class CutTheStick {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int lengths[] = new int[n];
        List<Integer> output = new LinkedList<Integer>();

        for (int i = 0; i < n; i++)
            lengths[i] = sc.nextInt();

        sc.close();
        Arrays.sort(lengths);

        for (int i = 0; i < n; i++) {
            if (lengths[i] == 0)
                continue;
            else {
                output.add(n - i);
                final int v = lengths[i];
                for (int j = i; j < n; j++) {
                    lengths[j] -= v;
                }
             // System.out.println("");
            }
        }

        for (int i = 0; i < output.size(); i++)
            System.out.println(output.get(i));
    }
}