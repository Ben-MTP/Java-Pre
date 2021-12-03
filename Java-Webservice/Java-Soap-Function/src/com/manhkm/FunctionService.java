package com.manhkm;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface FunctionService {
	
	@WebMethod
	int addtion(int a, int b);
	
	@WebMethod
	int subtraction(int a, int b);
	
	@WebMethod
	int multiplication(int a, int b);
	
	@WebMethod
	float division(int a, int b);
}
