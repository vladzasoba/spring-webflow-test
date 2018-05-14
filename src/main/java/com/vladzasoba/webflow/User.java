package com.vladzasoba.webflow;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 65677688012L;

	private String username;
	private String password;

	public User() {}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + ((username == null) ? 0 : username.hashCode());
		result = result * prime + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		User user = (User) obj;
		return username.equals(user.getUsername()) && password.equals(user.getPassword());
	}
}