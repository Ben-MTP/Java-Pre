package com.demo;

public class StringNormal {

	public static void main(String[] args) {

		long start = System.nanoTime();
		
		String s = "Hello";
		for(int i = 0; i < 1000; i++) {
			s += " world";
		}
		long end = System.nanoTime();
		
		System.out.println("Total time: " + (end-start));
	}
}
