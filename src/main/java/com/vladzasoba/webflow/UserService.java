package com.vladzasoba.webflow;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public String checkUser(User user) {
		if (user != null && user.getUsername().equals("admin") && user.getPassword().equals("1111aaaa")) {
			return "succes";
		}
		return "failed";
	}
}