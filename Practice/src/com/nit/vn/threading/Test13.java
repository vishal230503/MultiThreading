package com.nit.vn.threading;

class MyThread09 extends Thread {
	@Override
	public void run() {
		System.out.println("run is executed in the thread " + getName());
	}
}
public class Test13 {
	public static void main(String[] args) {
		MyThread09 mt = new MyThread09();
		mt.run();
	}
}
