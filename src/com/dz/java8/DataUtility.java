package com.dz.java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

import com.dz.java8.stream.Emp;

public class DataUtility {

	public static List<Emp> getEmps() {
		
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1, "akshay", 30000.0));
		empList.add(new Emp(2, "manish", 50000.0));
		empList.add(new Emp(3, "sumit", 45000.0));
		empList.add(new Emp(4, "ganu", 40000.0));
		empList.add(new Emp(5, "suraj", 18000.0));
		empList.add(new Emp(6, "pappu", 90000.0));
		empList.add(new Emp(7, "pranav", 35000.0));
		empList.add(new Emp(8, "suwanand", 40000.0));
		empList.add(new Emp(9, "vasant", 150000.0));
		empList.add(new Emp(10, "hanuman", 25000.0));
		
		return empList;
	}
	
	static Supplier<Double> randumNumber=()->{
		return Math.random();
	};
	
	
	static Supplier<String> randumString=()->{
		return UUID.randomUUID().toString();
	};
	
	static Supplier<LocalDate> currentDate=()->{
		return LocalDate.now();
	};
	
	public static void main(String[] args) {
		
		
		
	}
}
