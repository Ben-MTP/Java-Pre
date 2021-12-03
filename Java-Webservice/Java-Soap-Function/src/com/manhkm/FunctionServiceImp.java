package com.manhkm;

import javax.jws.WebService;

@WebService(endpointInterface = "com.manhkm.FunctionService")
public class FunctionServiceImp implements FunctionService{

	@Override
	public int addtion(int a, int b) {
		return a + b;
	}

	@Override
	public int subtraction(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

	@Override
	public float division(int a, int b) {
		return a/b;
	}

}
