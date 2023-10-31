package com.nit.vn.threading;

class MyThread16 extends Thread {
	@Override
	public void run() {
		System.out.println("run execute");
		for(int i=1;i<=40;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
public class Test26 {
	public static void main(String[] args) {
		System.out.println("main start");
		MyThread16 mt = new MyThread16();
		mt.start();
		System.out.println("Main end");
	}
}
