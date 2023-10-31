package com.nit.vn.threading;

class MyThread12 extends Thread {
	@Override
	public void run() {
		System.out.println("run start");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
		System.out.println("run end");
		
	}
}
public class Test19 {
	public static void main(String[] args) throws z {
		System.out.println("main start");
		
		MyThread12 mt1 = new MyThread12();
		mt1.interrupt();
		
		mt1.start();
		mt1.interrupt();
		
		Thread.sleep(3000);
		
		mt1.interrupt();
		System.out.println("main end");
	}
}