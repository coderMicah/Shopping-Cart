package com.micah.model;

public class UserModal {
	private int id;
	private String name;
	private String password;
	private String email;
	
	
	
	public UserModal() {
	}

	public UserModal(int id, String name, String password, String email) {
		this.setId(id);
		this.name = name;
		this.password = password;
		this.setEmail(email);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "UserModal [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
	}
	
	
	
	
	
}
