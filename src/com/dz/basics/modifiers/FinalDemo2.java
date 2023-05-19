package com.dz.basics.modifiers;

/******* Q) Is final method inherited? **/
//Ans:- Yes, final method is inherited but you cannot override it

class Bike {
	final void run() {
		System.out.println("running");
	}
}

public class FinalDemo2 extends Bike {

	public static void main(String[] args) {

		new FinalDemo2().run();
	}
}


/** Q) Can we declare a constructor final?  ***/
//No, because constructor is never inherited.