package com.dz.logical.ds;

public class BinarySearch {
	
	
	public static void main(String[] args) {
		
		
		int[] arr={1,2,3,4,5,6,7,8,9};
				 	
		int first=0;
		int last=arr.length-1;  //8
		int middle=(first+last)/2; //4 
		int search=5;
		
		while(first<=last) {		//5<8
			
			if(arr[middle]<search) {
				first=middle+1;
			}else if(arr[middle]==search) {
				System.out.println("element found at index "+middle);
				break;
			}else {
				last=middle-1;
			}
			
			middle=(first+last)/2;
		}

	}
}
