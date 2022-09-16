package com.thread.demo;

public class A3 extends Thread {
   
	Test obj;
	
	A3(Test obj){
	 this.obj=obj;
	}
	
	@Override
	public void run() {
		obj.method3();
	}
}
