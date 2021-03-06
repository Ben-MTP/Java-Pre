package com.demo;

public class StringBufferDemo {
	public static void main(String[] args) {
		long start = System.nanoTime();
		
		StringBuffer s = new StringBuffer("hello");
		for(int i = 0; i < 1000; i++) {
			s.append(" World");
		}
		long end = System.nanoTime();
		
		System.out.println("Total time: " + (end-start));
		// before: Total time: 5002500
		//         Total time: 1260700
	}
}
