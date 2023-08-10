package com.dz.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.dz.java8.stream.Emp;

public class Demo3 {
	
	

	public static void main(String[] args) {
		
		
		Predicate<Emp> prd1=(e)->{
			if(e.getSalary()>500.0 && e.getName().startsWith("p")) {
				return true;
			}
			return false;
		};
		
//		List<String> data = DataUtility.getEmps().stream().filter(prd1).map(mp-> mp.getName()).collect(Collectors.toList());
//		System.out.println(data);
		
		System.out.println(DataUtility.randumNumber.get());
		
		System.out.println(DataUtility.randumString.get());
		
		System.out.println(DataUtility.currentDate.get());
		
		System.out.println("________________________________________________\n");
		
		List<Emp> sortedBySalary = DataUtility.getEmps().stream().sorted((emp1,emp2)->{
			return  emp2.getSalary().compareTo(emp1.getSalary());
		}).collect(Collectors.toList());

		sortedBySalary.forEach(emp->{
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
		});

		System.out.println("________________________________________________\n");
		
		Optional<Emp> lowestSlaryEmp = DataUtility.getEmps().stream().sorted((emp1,emp2)->{
			return  emp2.getSalary().compareTo(emp1.getSalary());
		}).skip(DataUtility.getEmps().size()-2).findFirst();
		
		System.out.println(lowestSlaryEmp.get().getName()+" : "+lowestSlaryEmp.get().getSalary());
		
		System.out.println("________________________________________________\n");
		
//		second highest 
		Optional<Double> findFirst = DataUtility.getEmps().stream()
						     .map(mp-> mp.getSalary())
						     .sorted(Comparator.reverseOrder())
						     .skip(1)
						     .findFirst();
		
		System.out.println(findFirst.get());
		
	}
}
