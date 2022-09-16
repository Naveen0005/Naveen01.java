package com.thread.demo;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		Test test=new Test();
		
		A1 a1=new A1(test);
		
		A2 a2=new A2(test);
		
		A3 a3=new A3(test);
		
		A4 a4=new A4(test);
		
		a1.start(); 
		a1.interrupt();
		
		a2.start();
		a2.interrupt();
		
		a3.start();
		a4.start();
		
		
		
	
		
		}
		}
		

	


