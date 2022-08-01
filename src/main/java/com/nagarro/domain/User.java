package com.nagarro.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="demologin")
public class User {
	@Id
	@NotEmpty(message="username can't be null")
	private String userName;
	@NotEmpty(message="password can't be empty")
	private String password;

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
		this.password = password;
	}

}
