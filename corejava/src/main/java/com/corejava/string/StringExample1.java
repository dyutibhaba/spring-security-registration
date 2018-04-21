package com.corejava.string;

public class StringExample1 {

	public static void main(String[] args) {
		String ex = "sipu";
		String ex1 = new String("sipu");
		ex1.concat("dipu");
		System.out.println(ex1);
		
		System.out.println(ex.equals(ex1));
		System.out.println(ex.hashCode() == ex1.hashCode());
	}
}
