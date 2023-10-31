package com.nit.vn.threading;

class MyThread10 extends Thread {
	@Override
	public void run() {
		System.out.println("run is executed on the thread " + getName());
		System.out.println("run is executed in the thread " + Thread.currentThread().getName());
	}
}
public class Test14 {
	public static void main(String[] args) {
		MyThread10 mt1 = new MyThread10();
		mt1.run();
		
		mt1.start();
	}
}
