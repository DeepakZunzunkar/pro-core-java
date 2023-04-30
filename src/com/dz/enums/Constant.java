package com.dz.enums;

public interface Constant {

	public enum Days {

		/*
		 * SUN, MON , TUES, WED, thurs, fri, sat;
		 */

		SUN("Sunday",1), MON("Monday",2), TUES("TuesDay",3), WED("Wednesday",4), thurs("Thursday",5), fri("Fryday",6),sat("Saturday",7);

//		SUN(1), MON(2), TUES(3), WED(4), thurs(5), fri(6),
//		sat(7);
		
		private String dayFullName;
		private Integer dayIndex;
		
		private Days() {
			System.out.println("i am Days enum default constructor...");
		}
		
		private Days(String val,Integer index) {
			this.dayFullName=val;
			this.dayIndex=index;
		}
		
		public String getDay(){
			return this.dayFullName;
		}
		
		public Integer getIndex() {
			return this.dayIndex;
		}
		
	}

	public enum Months {

		JAN, FEB, MARCH, APRIL, MAY, JUNE, JULY, AUG, SEPT, OCT, NOV, DEC

	}
	
	public enum Gender {

		MALE("M"),
		FEMALE("F");
		
		private Gender() {
			System.out.println("called for each constant");
		}
		
		private String genderValue; 
		
		private Gender(String gender) {
			this.genderValue=gender;
		}
		public String getGenderValue() {
			return this.genderValue;
		}
	}
	
	public enum EmployeeStatus{
		
		ACTIVE("A"),
		ONLEAVE("L"),
		TERMINATED("T"),
		DECEASED("D");
		
		private String employeeStatusCode;
		
		private EmployeeStatus(String employeeStatus) {
			this.employeeStatusCode = employeeStatus;
		}

		public String getEmployeeStatusCode() {
			return employeeStatusCode;
		}
		
		public int indexValue() {
			return ordinal();
		}
	}
	
	public enum ResponseCode {

		SUCCESS(200),
		FAIL(201);
		
		private final int value; 

		
		ResponseCode(int responseCode) {
			this.value=responseCode;
		}
		
		public int getResponseCodeValue() {
			return this.value;
		}
	}
	
	public enum ResponseMessage {

		SUCCESS("success"),
		FAIl("fail"),
		RecordNotFound("Record Not Found ..");
		
		
		private ResponseMessage() {
			System.out.println("called for each constant");
		}
		
		private String value; 
		
		private ResponseMessage(String codeMessage) {
			this.value=codeMessage;
		}
		public String getResponseMessageValue() {
			return this.value;
		}
	}
}