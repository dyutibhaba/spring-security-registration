package com.corejava.java8features;

interface A {
	default void defaultMethod() {
		System.out.println("defaultMethod");
	}
	void show(int a);
}
/*class B implements A {

	public void show() {
		System.out.println("Hello");
		
	}

}*/

public class LambdaEx1 {

	public static void main(String[] args) {
		A a = b -> System.out.println("show implementation.."+b);
		
		a.show(4);
	}
	
}
