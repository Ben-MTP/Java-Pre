package com.use.jar;

import com.manhkm.jar.FunctionOne;

public class TestUseJar {
	
	public static void main(String[] args) {
		usingFunction();
	}
	
	public static void usingFunction() {
		FunctionOne functionOne = new FunctionOne();
		System.out.println(functionOne.add2(10, 20));
	}
	
}
