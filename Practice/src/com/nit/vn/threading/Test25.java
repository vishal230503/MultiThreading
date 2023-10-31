package com.nit.vn.threading;

class MyThread15 extends Thread {
	int x;
	
	MyThread15() {
		x=5;
	} 
	MyThread15(int x) {
		this.x = x;
	}
	@Override
	public void run() {
		for(int i=0;i<this.x;i++) {
			System.out.println(getName() + "Run: " + i);
		}
	}
}
public class Test25 {
	public static void main(String[] args) {
		
		MyThread15 mt1 = new MyThread15();
		mt1.start();
		
		MyThread15 mt2 = new MyThread15();
		mt2.start();
		
		MyThread15 mt3 = new MyThread15();
		mt3.start();
		
	}
}
