package com.nagarro.domain;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Book {

	@Id
	private int code;
	private String name;
	private String date;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Book [code=" + code + ", name=" + name + ", date=" + date + "]";
	}

}


