package com.adi.ToDoApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean isAuthenticate(String name, String password) {
		boolean isValidName = name.equalsIgnoreCase("Aditya");
		boolean isValidpassword = password.equalsIgnoreCase("apple");
		
		return isValidName && isValidpassword;
	}

}
