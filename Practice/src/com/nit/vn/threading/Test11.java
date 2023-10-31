package com.nit.vn.threading;

class MyThread8 extends Thread {
	@Override
	public void run() {
		System.out.println("run start");
		for(int i=1;i<=50;i++) {
			System.out.println(i + " ");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
}

class MyThread9 extends Thread {
	public void run() /*IllegalThreadStateException*/ {
		for(int i=50;i<=1;i++) {
			System.out.println(i +" ");
			
			try {
				Thread.sleep(100);
			} 
			catch (InterruptedException e) {}
		}
		System.out.println("run end");
	}
}
public class Test11 {
	public static void main(String[] args) {
		System.out.println("Main start");
		
		MyThread8 mt = new MyThread8();
		mt.start();
		
		MyThread9 mt1 = new MyThread9();
		mt1.start();
		System.out.println("Main end");
	}
}
