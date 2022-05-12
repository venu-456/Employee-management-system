package com.venu.apps.entity;

import javax.persistence.*;

@Entity
@Table(name= "User")
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String user_name;
	private String user_address;
	private String user_contact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_contact() {
		return user_contact;
	}
	public void setUser_contact(String user_contact) {
		this.user_contact = user_contact;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", user_address=" + user_address + ", user_contact="
				+ user_contact + "]";
	}
	
}
