package com.dz.java8;


// Runnable is functional interface , so we can use lambda expression ...
public class MultiThreadingWithLambdaExpression {

	public static void main(String[] args) {
		
		// normal way		
		/*MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}*/
		
		//using lambda expression
		/*Runnable r=()->{
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t=new Thread(r);*/
		
		Thread t=new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread");
			}
		});
		
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread ...");
		}
	}
	
}