package com.test.hackerrank;


//4205123
public class GenerateLowestNumber {
	static String generateLowestNumber(String number, int n) {
		if(n == 0) {
			return number;
		}
		
		int index = number.length()-1;
		for(int i=0;i< number.length()-1; i++) {
			if(getNum(number,i) > getNum(number, i+1)) {
				index = i;
				break;
			}
		}
		String newStr = number.substring(0, index);
		
		if(index < number.length() - 2) {
			newStr += number.substring(index+1);
			System.out.println(newStr);	
		}
		return generateLowestNumber(newStr, n-1);			
	}
	
	static int getNum(final String str, final int index) {
		return Character.getNumericValue(str.charAt(index));
	}

	public static void main(String[] args) {
		System.out.println(generateLowestNumber("4205123", 4));
	}
}
