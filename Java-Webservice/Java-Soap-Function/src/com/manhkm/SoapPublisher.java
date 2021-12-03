package com.manhkm;

import javax.xml.ws.Endpoint;

public class SoapPublisher {
	
	public static final String WS_URL = "http://localhost:8089/ws/function";
	public static void main(String[] args) {
		System.out.println("Publisher soap service function!");
		Endpoint.publish(WS_URL, new FunctionServiceImp());
	}
}
