package com.venu.apps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Emp {
	@Id
	@GeneratedValue
	private int id;
	private String Emp_name;
	private String Emp_add;
	private String Emp_contact;
	private double Emp_salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	public String getEmp_add() {
		return Emp_add;
	}
	public void setEmp_add(String emp_add) {
		Emp_add = emp_add;
	}
	public String getEmp_contact() {
		return Emp_contact;
	}
	public void setEmp_contact(String emp_contact) {
		Emp_contact = emp_contact;
	}
	public double getEmp_salary() {
		return Emp_salary;
	}
	public void setEmp_salary(double emp_salary) {
		Emp_salary = emp_salary;
	}
	@Override
	public String toString() {
		return "EmpService [id=" + id + ", Emp_name=" + Emp_name + ", Emp_add=" + Emp_add + ", Emp_contact="
				+ Emp_contact + ", Emp_salary=" + Emp_salary + "]";
	}
	
	
}
