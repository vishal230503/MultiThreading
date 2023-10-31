package com.nit.vn.threading;

class MyThread04 extends Thread {
	private String getState;

	@Override
	public void run() {
		MyThread04 mt = new MyThread04();
		
		System.out.println("run start");
		System.out.println("in run #1: " + mt.getState());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		System.out.println("run end");
		
	}
}
public class Test06 {
	private static String BankHName;
	private static String Bankbal;
	private static String BankName;

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main start");
		
		MyThread04 mt1 = new MyThread04();
		mt1.start();
		
		System.out.println("Account create started");
		System.out.println("Crerated your account");
		
		System.out.println("BankHName: " + BankHName);
		System.out.println("BankBal: " + Bankbal);
		System.out.println("BankName: " +BankName);
		
		System.out.println();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {}
		
		System.out.println("In main #2: " + mt1.getState());
		System.out.println("Thread: " + mt1.getPriority());
		
		//Thread.getPriority(7);
		System.out.println("Main end");
		
		
	}
}
