package com.test.hackerrank;

/*
 * Problem Statement

Increasing popularity of hackerrank can be seen in tweets like

I love #hackerrank
I just scored 27 points in the Picking Cards challenge on #HackerRank
I just signed up for summer cup @hackerrank
Given a set of most popular tweets, your task is to find out how many of those tweets has the string hackerrank in it.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tweets {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.nextLine());
        String[] lines = new String[N];

        for (int i = 0; i < lines.length; i++) lines[i] = s.nextLine();

        int c = 0;
        Pattern p = Pattern.compile(".*hackerrank.*", Pattern.CASE_INSENSITIVE);

        for (String line : lines) {
            Matcher m = p.matcher(line);
            if (m.matches()) c++;
        }

        System.out.println(c);
    }
}
