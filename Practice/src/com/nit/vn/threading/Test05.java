package com.nit.vn.threading;

public class Test05 {
	public static void main(String[] args) {
		System.out.println("Main start");
		MyThread7 mt = new MyThread7();
		System.out.println("In main #1: "+ mt.getState());
		
		mt.start();
		System.out.println("In main #2: "+ mt.getState());
		
		try {Thread.sleep(2000);}
		catch(InterruptedException e) {}
		
		System.out.println("In main #4: "+ mt.getState());
		
		try {Thread.sleep(7000);}
		catch(InterruptedException e) {}
		
		System.out.println("In main #5: "+ mt.getState());
		System.out.println("main end");
	}
}

class MyThread7 extends Thread {
	@Override
	public void run() {
		System.out.println("run start");
		System.out.println("In run #3: "+ this.getState());
		
		try {Thread.sleep(5000);}
		catch(InterruptedException e) {}
		
		System.out.println("run end");
	}
}
