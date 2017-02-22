package com.hhyz.oa.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable{
	private Integer id;
	private String userName;
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password != null) {
			password = password.trim();
		} else {
			password = "";
		}
		this.password = password;
	}

	@Override
	public String toString() {
		String userToString = "id=" + id + "-userName=" + userName + "-password=" + password;
		return userToString;
	}
}
