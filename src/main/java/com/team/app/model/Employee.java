package com.team.app.model;

import javax.persistence.*;


@Entity
@Table(name ="Employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email_id")
	private String emailId;
	private String contact;
	private String designation;
	private String about;
	private int CL;
	private int EL;
	private int PL;
	private boolean isAdmin;
	private String img;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", contact=" + contact + ", designation=" + designation + ", about=" + about + ", CL=" + CL + ", EL="
				+ EL + ", PL=" + PL + ", isAdmin=" + isAdmin + ", img=" + img + "]";
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
		System.out.println("updated to "+this.isAdmin);
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
		System.out.println("updated to "+this.img);
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
		System.out.println("updated to "+this.contact);
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
		System.out.println("updated to "+this.designation);
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
		System.out.println("updated to "+this.about);
	}
	public int getCL() {
		return CL;
	}
	public void setCL(int cL) {
		CL = cL;
	}
	public int getEL() {
		return EL;
	}
	public void setEL(int eL) {
		EL = eL;
	}
	public int getPL() {
		return PL;
	}
	public void setPL(int pL) {
		PL = pL;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}

