package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employeedetails")
public class Model {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Model(int id, String employeeName, int employeeAge, long salary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.salary = salary;
	}
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String employeeName;
	private int employeeAge;
	private long salary;
}
