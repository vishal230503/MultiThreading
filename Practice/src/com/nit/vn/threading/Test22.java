package com.nit.vn.threading;

class Addition01 {
	private int x;
	private int y;
	
	public void add(int x,int y) {
		this.x = x;
		this.y = y;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		
		int res = this.x + this.y;
		System.out.println(Thread.currentThread().getName() + "result" + res);
	}
}

class Thread5 extends Thread {
	private Addition a;
	public Thread5(Addition a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.add(10, 20);
	}
}

class Thread6 extends Thread {
	private Addition a;
	public Thread6(Addition a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.add(30, 40);
	}
}
public class Test22 {
	public static void main(String[] args) {
		Addition a = new Addition();
		new Thread5(a).start();
		new Thread6(a).start();
	}
}
