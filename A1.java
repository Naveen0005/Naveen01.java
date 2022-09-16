package com.thread.demo;


public class A1 extends Thread {
	
	Test obj;

	A1(Test obj){
		this.obj=obj;
	}
	
	@Override
	public void run() {
		obj.method1();
		
	
	}

  }


