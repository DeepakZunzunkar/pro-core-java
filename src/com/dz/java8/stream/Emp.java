package com.dz.java8.stream;

import java.util.List;

public class Emp {

	private Integer id;
	private String name;
	private List<String> mobileNumbers;
	private Double salary;
	
	
	public Emp(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Emp() {
		super();
	}


	public Emp(Integer id, String name, List<String> mobileNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumbers = mobileNumbers;
	}


	public List<String> getMobileNumbers() {
		return mobileNumbers;
	}


	public void setMobileNumbers(List<String> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}


	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}

}