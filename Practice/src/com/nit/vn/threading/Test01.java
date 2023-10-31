package com.nit.vn.threading;

class MyThread01 extends Thread {
	@Override
	public void run() {
		System.out.println("Run excute");
		//super.run();
	}
}

public class Test01 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		
		MyThread01 t1 = new MyThread01();
		t1.start();
	}
}
