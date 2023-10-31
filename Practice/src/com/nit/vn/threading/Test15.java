package com.nit.vn.threading;

public class Test15 {
	public static void main(String[] args) {
		Thread th1 = new Thread();
		System.out.println(th1);
		
		Thread th2 = new Thread("child2");
		System.out.println(th2);
	}
}
