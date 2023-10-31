package com.nit.vn.threading;

class MyThread11 extends Thread {
	@Override
	public void run() {
		System.out.println("run executed");
	}
}
public class Test18 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread11 mt1 = new MyThread11();
		mt1.start();
		
		Thread.sleep(1000);
		
		System.out.println("main end");
	}
}
