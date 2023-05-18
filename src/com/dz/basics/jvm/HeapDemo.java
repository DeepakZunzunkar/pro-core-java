package com.dz.basics.jvm;

import java.text.DecimalFormat;

import com.dz.basics.Calculator;

public class HeapDemo 
{
	
	private static final DecimalFormat df = new DecimalFormat("0.00");

//Memory 
/*
 	A group of eight bits is known as a Byte. 
	1 Byte can represent numbers between zero (00000000) and 255 (11111111), or 2^8 (2 to the power 8) = 256 distinct positions.
	In practice, memory is measured in KiloBytes (KB) or MegaBytes (MB).
	A KiloByte is not exactly, as one might expect, 1000 Bytes. Rather, the correct amount is 2 ^ 10 i.e. 1024 bytes. 
	
	1 Kb = 1024 byte
	Similarly, a megabyte is not 1000^2 i.e. 1,000,000 bytes, but instead 1024^2 i.e. 1, 048,576 bytes. 
	
	1 MB = 1024 KB = 1,048,576 Bytes

*/
	public static void main(String[] args)
	{
		double mb=1024*1024;
		double gb=1024*1024*1024;
		
		Runtime r=Runtime.getRuntime();
		
		System.out.println(" before round off \n");
		
		System.out.println("Max memeory "+r.maxMemory()/mb);
		System.out.println("Max memeory "+r.maxMemory()/gb +" gb");
		
		System.out.println("total memory "+r.totalMemory()/mb);
		System.out.println("free memeory "+r.freeMemory()/mb);
		System.out.println("free memeory with roundoff "+Calculator.roundOff1((r.freeMemory()/mb))+" mb");
		System.out.println("consumed memeory "+(r.totalMemory()-r.freeMemory())/mb);
		
		System.out.println("\n After round off \n");
		
		System.out.println("Max memeory "+Calculator.roundOff1(r.maxMemory()/mb) +" mb");
		System.out.println("Max memeory "+Calculator.roundOff1(r.maxMemory()/gb) +" gb");
		
		System.out.println("total memory "+Calculator.roundOff1(r.totalMemory()/mb) +" mb");
		System.out.println("free memeory "+Calculator.roundOff1((r.freeMemory()/mb))+" mb");
		System.out.println("consumed memeory "+Calculator.roundOff1((r.totalMemory()-r.freeMemory())/mb) +" mb");
	}

/*	
	Bit	--->  0 or 1, is called a Bit.
	Nibble --> 4 bits of binary
	Byte   --> 8 byte
	
	Kilo Byte --> 1 Kb = 1024 byte
	
	MegaByte  --> 1 MB = 1024 KB = 1,048,576 Bytes
	
	Giga Byte --> 1 GB = 1024MB = 1,048,576 KB = 1,073,741,824 Bytes
	
	Tera Byte --> 1 TB = 1024 GB = 1,048,576 MB = 8,388,608 KB = 1,099,511,627,776 Bytes
					
					
	Peta Byte --> 1 PB = 1024 TB = 1,048,576 GB = 1,073,741,824  MB = 1,099,511,627,776 KB = 1,125,899,906,842,624 Bytes
	
	Exa Byte --> 1 EB = 1024 PB = 1,048,576 TB = 1,073,741,824 GB = 1,099,511,627,776 MB = 1,125,899,906,842,624 KB = 1,152,921,504,606,846,976 Bytes
	
	Zetta Byte --> 1 ZB = 1024 EB
	
	Yotta Byte --> 1 YB = 1024 ZB

*/	
}
