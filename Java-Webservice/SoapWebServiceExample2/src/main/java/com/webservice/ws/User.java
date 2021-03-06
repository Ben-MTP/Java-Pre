package com.webservice.ws;

public class User {
	
	private Integer id;
	private String username;
	
	// constructor:
	public User(Integer id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	
	public User() {
		
	}

	// set-get:
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// toString:
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + "]";
	}
}
