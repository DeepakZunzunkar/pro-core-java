package com.dz.logical;

public class SecondHighest {
	
	public static void main(String[] args) {
		
		int[] arr={10,20,30,50,60,40,15};
		
		secoundLargest();
	}
	
	
	public static void secoundLargest(){
		
		int[] arr={45,95,10,20,50,100,60,96,70};	// 8
		
		int flarge=0;
		int slarge=0;
		
		//		0		7
		for(int i=0;i<arr.length-1;i++) {
		
			if(arr[i] > flarge) {
				slarge=flarge;
				flarge=arr[i];
			}else if(arr[i]> slarge) {
				slarge=arr[i];
			}
		}
		System.out.println(flarge);
		System.out.println(slarge);
	}
}
