package com.webservice.ws;

import javax.xml.ws.Endpoint;

public class SoapPublisher {

	public static final String WS_URL = "http://localhost:8089/ws/users";
	
	public static void main(String[] args) {
		Endpoint.publish(WS_URL, new UserServiceImpl());
		System.out.println("Soap Published!");
	}
}
