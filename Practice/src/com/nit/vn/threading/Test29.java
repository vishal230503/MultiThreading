package com.nit.vn.threading;

class MyThread21 extends Thread {
	@Override
	public void run() {
		System.out.println("run start");
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
		System.out.println("run end");
	}
}
public class Test29 {
	public static void main(String[] args) {
		System.out.println("main start");
		MyThread21 mt1 = new MyThread21();
		mt1.start();
		System.out.println("Main end");
	}
}
