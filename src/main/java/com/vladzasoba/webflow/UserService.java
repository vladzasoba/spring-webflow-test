package com.vladzasoba.webflow;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public String checkUser(User user) {
		if (user.getUsername() != null && user.getUsername().equals("admin")
				&& user.getPassword() != null && user.getPassword().equals("1111aaaa")) {
			return "success";
		}
		return "failed";
	}
}