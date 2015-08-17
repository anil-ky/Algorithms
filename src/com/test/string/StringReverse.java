package com.test.string;

public class StringReverse {

	static String reverse = "";

	public static void main(String[] args) {
		String name = "ANIL KUMAR";

		System.out.println(name);
		StringBuffer sb = new StringBuffer();

		for (int i = name.length() - 1; i >= 0; i--) {
			sb.append(name.charAt(i));
		}

		System.out.println(sb.toString());
		System.out.println(sb.reverse());
		System.out.println(stringReverse(name));
	}

	public static String stringReverse(String string) {

		if (string == null || string.length() == 1) {
			return string;
		} else {
			reverse += string.charAt(string.length() - 1)
					+ stringReverse(string.substring(0, string.length() - 1));
			return reverse;
		}
	}
}
