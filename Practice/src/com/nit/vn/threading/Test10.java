package com.nit.vn.threading;

class MyThread06 extends Thread {
	@Override
	public void run() {
	System.out.println("run executed");
	}
}
public class Test10 {
	public static void main(String[] args) {
		System.out.println("Main start");
		
		MyThread06 mt = new MyThread06();
		mt.start();
		
		Thread.yield();
		
		System.out.println("main end");
	}
}
