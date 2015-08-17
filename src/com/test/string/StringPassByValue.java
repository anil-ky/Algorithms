package com.test.string;

public class StringPassByValue {

	public static void main(String[] args) {
		Dog aDog = new Dog("Max");
	    foo(aDog);
	    if( aDog.getName().equals("Max") ){ //true
	        System.out.println( "Java passes by value." );
	    }else if( aDog.getName().equals("Fifi") ){
	        System.out.println( "Java passes by reference." );
	    }
	}

	public static void foo(Dog d) {
	    d.getName().equals("Max"); // true
	    //d = new Dog("Fifi");
	    d.setName("Fifi");
	}
}

class Dog {
	private String name;

	public Dog(String string) {
		this.name = string;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
