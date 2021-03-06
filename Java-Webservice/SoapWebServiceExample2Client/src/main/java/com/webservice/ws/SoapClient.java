package com.webservice.ws;

import java.util.Arrays;

/**
 * 
 * @author ManhKM
 * wsimport -s . http://localhost:8089/ws/users?wsdl
 *
 */
public class SoapClient {
	public static void main(String[] args) {
		UserServiceImplService userServiceImplService = new UserServiceImplService();
		UserService userService = userServiceImplService.getUserServiceImplPort();
		
		User user1 = new User();
		user1.setId(100);
		user1.setUsername("alibaba");
		
		User user2 = new User();
		user2.setId(101);
		user2.setUsername("tom");
		
		User user3 = new User();
		user3.setId(102);
		user3.setUsername("jery");
		
		userService.insert(user1);
		userService.insert(user2);
		userService.insert(user3);
		
		System.out.println(Arrays.asList(userService.getAll()));
		
		
	}
}
