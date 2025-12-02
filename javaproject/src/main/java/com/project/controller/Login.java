package com.project.controller;

import java.util.Map;

import com.project.Read;

public class Login {

	Map<String, String> user = Map.of("User1", "User7781", "User2", "User2704");

	public boolean login() throws Exception{

		System.out.println("Enter User name");
		String name = Read.sc.next();
		System.out.println("Enter password");
		String pw = Read.sc.next();
		if (user.containsKey(name) && user.get(name).equals(pw)) {
			System.out.println("Logged in successfully");
			return true;
		} else {
			throw new LoginException("Invalid credentials");
//			return false;

		}
	}
}
