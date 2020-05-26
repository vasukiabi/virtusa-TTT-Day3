package net.codejava.spring.model;

import java.util.Date;

public class User {
	private String firstname;
	private String lastname;
	private String email;
	private int age;
	
	private String profession;

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
