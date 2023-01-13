package com.demo.model;


public class User {

	String name;
	String e_mail;
	int age ;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getE_mail() {
		return e_mail;
	}

	public User(String name, String e_mail, int age, String password) {
		super();
		this.name = name;
		this.e_mail = e_mail;
		this.age = age;
		this.password = password;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
