package com.nit.vn.threading;

class Addition {
	private static int x;
	private static int y;
	
	public static synchronized void add(int x , int y) {
		Addition.x = x;
		Addition.y = y;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		int res = Addition.x + Addition.y;
		System.out.println(Thread.currentThread().getName() + "result: " + res);
		
	}
}

class Thread3 extends Thread {
	@Override
	public void run() {
		Addition.add(10,20);
	}
}

class Thread4 extends Thread {
	@Override
	public void run() {
		Addition.add(30, 40);
	}
}
public class Test21 {
	public static void main(String[] args) {
		new Thread3().start();
		new Thread4().start();
	}
}
