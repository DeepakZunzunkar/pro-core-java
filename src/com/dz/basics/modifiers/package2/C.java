package com.dz.basics.modifiers.package2;

import com.dz.basics.modifiers.package1.A;

public class C extends A{
	
	private int a7 = 70;
	protected int a8 = 80;
	
	private int m7() {
		return a7;
	}

	protected int m8() {
		return a8;
	}
	
	@Override
	protected int m4() {
		return super.m4();
	}
}
