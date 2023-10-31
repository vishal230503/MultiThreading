package com.nit.vn.threading;

class MyThread14 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<=50;i++) {
			System.out.println(getName() +"Run: " + i);
		}
	}
}
public class Test24 {
	public static void main(String[] args) {
		MyThread14 mt1 = new MyThread14();
		mt1.start();
		
		MyThread14 mt2 = new MyThread14();
		mt2.start();
		
		MyThread14 mt3 = new MyThread14();
		mt3.start();
		
	}
}