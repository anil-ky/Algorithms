package com.test.string;

public class StringSwap {

	public static void main(String[] args) {
		
		String s1 ="one";
		String s2 = "two";
		
		int len1 = s1.length();
		
		s1 = s1+s2;
		s2 = s1.substring(0,len1);
		s1 = s1.substring(len1);
		
		System.out.println(s1 + " - " + s2);
		
	}

}
