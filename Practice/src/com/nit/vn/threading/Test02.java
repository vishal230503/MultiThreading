package com.nit.vn.threading;

class MyThread03 extends Thread {
	@Override
	public void run() {
		System.out.println("Run excute");
		super.run();
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Runnable excute");
		
	}
}

public class Test02 {
	public static void main(String[] args) {
		System.out.println("Main start");
		
		MyThread03 m1 = new MyThread03();
		m1.start();
		
		MyRunnable m2 = new MyRunnable();
		m2.run();
	}
}
 