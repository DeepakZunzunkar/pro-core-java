package com.dz.model;

import java.util.Date;

public class Emmployee {

	
	private Long eid;
	private String firstName;
	private String lastName;
	private String gender;
	private String status;
	private Date birthDate;
	private Double salary;
	
	
	
	public Emmployee(String gender, Double salary) {
		super();
		this.gender = gender;
		this.salary = salary;
	}
	
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emmployee [eid=" + eid + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", status=" + status + ", birthDate=" + birthDate + ", salary=" + salary + "]";
	}
	
}
