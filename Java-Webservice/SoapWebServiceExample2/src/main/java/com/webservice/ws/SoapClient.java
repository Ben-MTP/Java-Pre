package com.webservice.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class SoapClient {
	public static void main(String[] args) throws MalformedURLException {
		
		// create url of .wsdl file:
		URL wsdlURL = new URL(SoapPublisher.WS_URL + ".wsdl");
		
		// create a qname using targerNamesapce and name:
		QName qname = new QName("http://ws.webservice.com/", "UserServiceImplService");
		
		// create a service instance with the specified WSDL.
		Service service = Service.create(wsdlURL, qname);
		
		// we need to pass interface and model beans to client:
		UserService userService = service.getPort(UserService.class);
		
		User user1 = new User(1, "manhkm");
		User user2 = new User(2, "trangtt");
		User user3 = new User(3, "thanglv");
		
		userService.insert(user1);
		userService.insert(user2);
		userService.insert(user3);
		
		// get all users:
		System.out.println(Arrays.asList(userService.getAll()));
		
	}
}
