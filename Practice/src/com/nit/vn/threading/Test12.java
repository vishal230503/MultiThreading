package com.nit.vn.threading;

class MyRunnable2 implements Runnable {
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		System.out.println("run executed in " + th.getName() + " thread");
	}
}
public class Test12 {
	public static void main(String[] args) {
		System.out.println("main start");
		MyRunnable2 mr = new MyRunnable2();
		
		Thread th1 = new Thread(mr);
		Thread th2 = new Thread(mr);
		
		th1.start();
		th2.start();
		System.out.println("main end");
	}
}
