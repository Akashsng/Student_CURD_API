package com.example.demo.model;

public class StudentPostRequestModel {
	private String name;
	private String email;
	private String passWord;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public StudentPostRequestModel(String name, String email, String passWord) {
		super();
		this.name = name;
		this.email = email;
		this.passWord = passWord;
	}
	public StudentPostRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
