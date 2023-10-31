package com.nit.vn.threading;

class MyThread13 extends Thread {
	@Override
	public void run() {
		System.out.println("run start");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run end");
	}
}
public class Test20 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread13 mt1 = new MyThread13();
		mt1.start();
		
		//mt1.join();
		//mt1.join(3000);
		//mt1.join(10000);
		mt1.sleep(10000);
		
		System.out.println("main end");
	}
}
