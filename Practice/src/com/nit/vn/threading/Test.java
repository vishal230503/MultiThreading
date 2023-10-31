package com.nit.vn.threading;

class MyThread extends Thread {
	@Override
	public  void run() {
		System.out.println("Run excute");
	}
}

class Test {
	public static void main(String[] args) {
		System.out.println("Main Start");
		
		MyThread m1 = new MyThread();
		m1.start();
		
	}
}