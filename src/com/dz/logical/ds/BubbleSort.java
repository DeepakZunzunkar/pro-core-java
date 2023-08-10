package com.dz.logical.ds;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] < arr[j + 1]) {
					temp = arr[j]; // t=2
					arr[j] = arr[j + 1]; // 1 =2 ,
					arr[j + 1] = temp; // 2= -2
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
