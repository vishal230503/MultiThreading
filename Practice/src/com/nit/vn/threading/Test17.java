package com.nit.vn.threading;

public class Test17 {
	public static void main(String[] args) {
		Thread th1 = new Thread();
		System.out.println(th1);
		
		Thread th2 = new Thread("child2");
		System.out.println(th2);
		
		Thread th3 = Thread.currentThread();
		System.out.println(th3);
		
		th3.setPriority(7);
		
		Thread th4 = new Thread();
		System.out.println(th4);
	}
}
