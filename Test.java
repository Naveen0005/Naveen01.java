package com.thread.demo;
import java.util.Scanner;
public class Test {
	
	Scanner scan=new Scanner(System.in);
	
	synchronized void method1() {
		try {
			System.out.println("Enter the second for 1st method=");
			int a=scan.nextInt();
			Thread.sleep(a);
		}catch(InterruptedException e) {
			System.out.println("Interrupted 1st Method");
			System.out.println("Thread Name= "+Thread.currentThread().getName());
			System.out.println("Priority= "+Thread.currentThread().getPriority());
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			
		}
	}
	
	synchronized void method2() {
		try {
			System.out.println("Enter the second for 2nd method=");
			int a=scan.nextInt();
			Thread.sleep(a);
		}catch(InterruptedException e) {
			System.out.println("Interrupted 2nd Method");
			System.out.println("Thread Name= "+Thread.currentThread().getName());
			System.out.println("Priority= "+Thread.currentThread().getPriority());
		}
		for(int i=5;i<10;i++) {
			System.out.println(i);
			
		}

    }
	
	synchronized void method3() {
		for(int i=10;i<15;i++) {
			System.out.println(i);
			
			   }
		}
	
	
	synchronized void method4() {
		for(int i=15;i<20;i++) {
			System.out.println(i);
			
			 }
	}
}
