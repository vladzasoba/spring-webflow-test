package com.vladzasoba.webflow;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class UserService {
	private List<User> userList = new ArrayList<>();

	public String checkUser(User user) {
		if (user.getUsername() != null && user.getUsername().equals("admin")
				&& user.getPassword() != null && user.getPassword().equals("1111aaaa")) {
			return "success";
		}
		return "failed";
	}
}