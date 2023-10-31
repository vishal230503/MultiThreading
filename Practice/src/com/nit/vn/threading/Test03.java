package com.nit.vn.threading;

class MyThread5 extends Thread {
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println(getName() + "run: " + i);
		}
	}
}
public class Test03 {
	public static void main(String[] args) {
		MyThread5 mt1 = new MyThread5();
		MyThread5 mt2 = new MyThread5();
		
		mt1.start();
		mt2.start();
	}
}
